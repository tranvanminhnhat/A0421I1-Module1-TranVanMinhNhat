create database a04_student_manager_querry;
use a04_student_manager_querry;
create table account_jame(
`account` varchar(50) primary key,
password varchar(50)
);
create table instructor(
id int auto_increment primary key,
name varchar(250),
birthday date,
salary double
);
create table class_type(
id int auto_increment primary key,
type_class_name varchar(50)
);
create table class(
 id int auto_increment primary key,
 class_name varchar(50),
 class_type_id int,
 foreign key (class_type_id) references class_type(id)
);
create table student(
id int auto_increment primary key,
name varchar(250),
birthday date,
class_id int,
`point` int,
gender boolean,
`acount` varchar(50),
email varchar(50),
foreign key(acount) references account_jame(account),
foreign key(class_id) references class(id)
);
create table instructor_teach_class(
instructor_id int,
class_id int,
constraint pk_class_instructor primary key(instructor_id,class_id),
foreign key (instructor_id)references instructor(id),
foreign key (class_id)references class(id)
);
-- them dữ liệu cho tài khoản
insert into account_jame values("hai@gmail.com","123123");
insert into account_jame values("hoan@gmail.com","123123");
insert into account_jame values("chinh@gmail.com","123123");
insert into account_jame values("nga@gmail.com","123123");
insert into account_jame values("yen@gmail.com","123123");
insert into account_jame values("nam@gmail.com","123123");
insert into account_jame values("thao@gmail.com","123123");
insert into account_jame values("cu@gmail.com","123123");

insert into instructor(`name`,birthday, salary) values("chanh", "1993-02-03", 1222);
insert into instructor values(2,"hai", "1989-03-21",100);
insert into instructor values(3,"tien", "1993-03-21",100);
insert into instructor values(4,"trungdp", "1985-03-21",100);
insert into instructor values(5,"chien", "1993-03-21",100);

insert into class_type (type_class_name) value("FullTime");
insert into class_type (type_class_name) value("PartTime");

insert into class(class_name,class_type_id) values("C0221G1",2);
insert into class(class_name,class_type_id) values("C0321G1",2);
insert into class(class_name,class_type_id) values("A0321I1",1);
insert into class(class_name,class_type_id) values("A0421I1",1);

select * from student;
select id from class;
delete from student;
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Nguyễn Minh Hải','1989-02-23',1,5,true,'hai@gmail.com');
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Hoàng Hữu Hoan','2000-02-23',1,6,true,'hoan@gmail.com');
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Nguyễn Văn Chinh','1989-02-23',2,7,true,'chinh@gmail.com');
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Lê Thị Nga','2000-02-23',3,8,false,'nga@gmail.com');
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Lê Hải Yến','1989-02-23',3,9,false,'yen@gmail.com');
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Trần Văn Nam','2000-02-23',2,9,true,'nam@gmail.com');
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Nguyễn Ngọc Cừ','1989-02-23',2,9,true,'cu@gmail.com');
insert into student(`name`,birthday,`point`,gender,`acount`) values('Nguyễn Thị Thảo','1989-02-23',9,false,'thao@gmail.com');

delete from instructor_teach_class;
select * from instructor_teach_class;
insert into instructor_teach_class(instructor_id, class_id) values (1,1);
insert into instructor_teach_class(instructor_id, class_id) values (1,2);
insert into instructor_teach_class(instructor_id, class_id) values (2,1);
insert into instructor_teach_class(instructor_id, class_id) values (2,2);


select * from student;
select * from class;

-- 1. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào.—
select student.name, class.class_name from student
 join class
on student.class_id = class.id;

-- 1. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào.—
select s.name, c.class_name, ct.type_class_name from student as s
join class as c
on s.class_id = c.id
join class_type as ct
on c.class_type_id=ct.id ;
-- 2. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào và cả các bạn đã đăng ký nhưng chưa có lớp học—
select s.name, c.class_name from student as s
 left join class as c
on s.class_id = c.id;

-- 4. Lấy thông tin của các học viên tên 'MINH'
select * from student;
select *
from student
where `name`='minh' and `point`=6;
-- 5 . Lấy thông tin của các học viên tên bắt đầu bằng ký tự "N'
select * from student;
select *
from student
where `name` like concat("%",convert("ữ",binary),"%");
-- 6 . Lấy thông tin của các học viên có điểm 6-8
select * from student;
select *
from student
where `point` between 6 and 8;

-- 6 . Lấy thông tin của các học viên có điểm 5,7,9
select * from student;
select *
from student
where `point` in(5,7,9);

-- 7. thông kế số lượng điểm học sinh viên theo từng loại điểm
select * from student;
select point, count(*) as so_luong
from student
group by point;
-- 7. thông kế số lượng điểm học sinh viên  lớn hơn 7 và có số lượng từng loại lớn hơn 2
select * from student;
select point, count(*) as so_luong
from student
where point >=7
group by point
having so_luong>2;

-- 6. Lấy ra danh sách học viên và sắp xếp tên theo alphabet.
select * from student
order by `name`,point;

-- bài 4. các hàm thông dụng trong mysql
-- 1. Hiện thị danh sách các lớp đang có học viên theo học và số lượng học viên, tính điểm trung bình của tường lớp của mỗi lớp
select* from student;
select* from class;

select c.class_name, count(*) as so_luong_hv, avg(point) as diem_trung_binh from student as s
join class as c
on s.class_id=c.id
group by c.class_name;

-- 2.	Hiện thi danh sách các lớp đang có học viên theo học và độ tuổi lớn nhất của lớp

select c.class_name, min(s.birthday) as tuoi_lon_nhat from student as s
join class as c
on s.class_id=c.id
group by c.class_name;

-- 4 Union -Lấy ra toàn bộ thông tin tên và ngày sinh các instructor và student ở CodeGym.
select * from student;
select * from instructor;
 
select s.`name` as ho_va_ten, s.birthday as ngay_sinh from student as s
union all
select i.`name`, i.birthday from instructor as i;

-- 5 limit- Lấy ra 3 học viên trẻ tuổi nhất ở CodeGym
select * from student
order by birthday desc, point desc 
limit 3;

-- 6 (sub query) Lấy ra các học viên có điểm số là cao nhất
select * from class;
select * from student
where point =(select max(point)  from student);

-- 7 (sub query) Lấy ra các học viên có điểm số là cao nhất của lớp cC0321G1
select * from student
join class
on student.class_id = class.id
where class.class_name ="C0321g1" AND point =(select max(point)  from student);

-- 8 sừ dụng like cho tiếng viêt utf8
select * from student
where `name` like concat("%",convert("Thị",binary),"%");


-- index view sp
-- 1. INDEX
-- 2. view
select * 
from student as s
join class as c
on s.class_id=c.id;

select *from student;
select *from class;

create view w_student_class as
select s.id as student_id, c.id as class_id,  s.name, c.class_name 
from student as s
join class as c
on s.class_id=c.id;

create view w_student as
select s.id, s.name, s.`acount`
from student as s;


select * from w_student;
insert into w_student (id,`name`,acount) values (23,'chanh','chanh@gmail.com');

select * from w_student_class;
select * from account_jame;

insert into w_student_class(student_id, `name`) values (12,"chanh");








-- index view sp
-- 1. INDEX
create index on student(class_id);
explain select *
from student
where class_id=2;
-- 2. Tạo view Student_class
create view w_student_class as
select s.id as student_id, s.`name`, c.class_name
from student as s 
join class as c
on s.class_id = c.id;

select *
from w_student_class;

select * from class;

insert into w_student_class (class_name) values ("C04");

delete from w_student_class
where student_id =2;

create view w_student as
select * from student;

select * from w_student;

insert into w_student(id, name) values(12,"chanh");
delete from w_student where id=12;

create or replace view w_student as
select student.id as student_id,student.name
from student;

select *from student;
select *
from w_student;

delete from w_student
where student_id=2;

update w_student 
set name ='chanh'
where student_id=1;
insert into w_student (student_id, name) values(10,"tien");

-- 2. Store procedure ( thục tuc)
DELIMITER $$
create procedure sp_get_all_student()
Begin
select *
from student;
end $$
DELIMITER ;
 -- sư dụng bằng calll
 call sp_get_all_student();

DELIMITER $$
create procedure sp_edit_student_by_id(p_id int,p_name varchar(100))
Begin
update student set `name`= p_name
where id=p_id;
end $$
DELIMITER ;

call sp_edit_student_by_id(1,"trần văn chánh");

DELIMITER $$
create procedure sp_count_student(out p_count int)
Begin
declare c int default 10;
select (count(*)+c) into p_count
from student;
end $$
DELIMITER ;

call sp_count_student(@count1);
select @count1;

-- trigger
DELIMITER $$
create trigger add_account_student
after insert
on student FOR EACH ROW
BEGIN
insert into account_jame(`account`,`password`) values(new.email,"123");
END $$
DELIMITER ;
insert into student(`name`,birthday,class_id,`point`,gender,email) values('Hoàng Duy Thanh','1989-02-23',1,5,true,'thanh@gmail.com');

select * from account_jame;











































































-- bài 4. các hàm thông dụng trong mysql
-- 1. Hiện thị danh sách các lớp đang có học viên theo học và số lượng học viên của mỗi lớp
select* from student;
select* from class;
-- 2.	Hiện thi danh sách các lớp đang có học viên theo học và độ tuổi lớn nhất của lớp
select c.class_name,c.id, count(*) as so_luong_hv, max(birthday) as tuoi_lon_nhat from
student as s
 join class as c
on s.class_id = c.id
group by c.class_name;
-- 3.	 Tình điểm trung bình trung bình của các lớp
select c.class_name,c.id, count(*) as so_luong_hv, max(birthday) as tuoi_lon_nhat, avg(point) as diem_tb from
student as s
 join class as c
on s.class_id = c.id
group by c.class_name;

-- 4 Union -Lấy ra toàn bộ thông tin tên và ngày sinh các instructor và student ở CodeGym. 
select * from student;
select * from instructor;
select s.`name` as student_name, s.birthday from student as s
union all
select i.`name` as i_name, i.birthday from instructor as i;

-- 5 limit- Lấy ra 3 học viên trẻ tuổi nhất ở CodeGym
select * from student
order by birthday desc, point desc
limit 1,2;

-- 6 (sub query) Lấy ra các học viên có điểm số là cao nhất
select * from student
where point= (select max(point) from student);
-- 
select * from student
where exists (select * from class where class.id=student.class_id);

select * from student
where student.class_id in (select id from class);


-- Datediff

select * from student
where DATEDIFF('2021-10-6',birthday)>23;



































