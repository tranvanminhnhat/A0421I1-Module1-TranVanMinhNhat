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
salarry double
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
insert into account_jame values("minh@gmail.com","123123");
insert into account_jame values("hoang@gmail.com","123123");
insert into account_jame values("tuan@gmail.com","123123");
insert into account_jame values("hung@gmail.com","123123");
insert into account_jame values("nga@gmail.com","123123");
insert into account_jame values("yen@gmail.com","123123");
insert into account_jame values("thao@gmail.com","123123");
insert into account_jame values("cu@gmail.com","123123");

insert into instructor(`name`,birthday, salarry) values("chanh", "1993-02-03", 1222);
-- insert into instructor values(2,"hai", "1989-03-21",100);
-- insert into instructor values(3,"tien", "1993-03-21",100);
-- insert into instructor values(4,"trungdp", "1985-03-21",100);
-- insert into instructor values(5,"chien", "1993-03-21",100);

insert into class_type (type_class_name) value("FullTime");
insert into class_type (type_class_name) value("PartTime");

insert into class(class_name,class_type_id) values("C0221G1",2);
insert into class(class_name,class_type_id) values("C0321G1",2);
insert into class(class_name,class_type_id) values("A0321I1",1);
insert into class(class_name,class_type_id) values("A0421I1",1);

select * from student;
delete from student;
insert into student(`name`,birthday,class_id,`point`,gender) values('Minh','1989-02-23',1,5,true);
insert into student(`name`,birthday,class_id,`point`,gender) values('Nguyen Van Minh','1989-02-23',1,6,true);
insert into student(`name`,birthday,class_id,`point`,gender) values('Nguyễn Minh Hải','1989-02-23',2,7,true);
insert into student(`name`,birthday,class_id,`point`,gender) values('Lê Thị Nga','1989-02-23',3,8,false);
insert into student(`name`,birthday,class_id,`point`,gender) values('Lê Hải Yến','1989-02-23',3,9,false);
insert into student(`name`,birthday,class_id,`point`,gender) values('Hoàng Hữu Hoan','1989-02-23',2,9,true);
insert into student(`name`,birthday,class_id,`point`,gender,`acount`) values('Nguyễn Ngọc Cừ','1989-02-23',2,9,true,'cu@gmail.com');
insert into student(`name`,birthday,`point`,gender,`acount`) values('Nguyễn thị thảo','1989-02-23',9,false,'thao@gmail.com');

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
where `name` like "%v%";
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








































-- 1. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào.-- 
select student.*,class.class_name from
student join class
on student.class_id =  class.id;

-- 2. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào và cả các bạn đã đăng ký nhưng chưa có lớp học-- 
select student.*,class.class_name from
student left join class
on student.class_id =  class.id;

-- 4. Lấy ra thông tin của các lớp có học viên đang theo học và lớp chưa có học viên theo học -- 
select student.*,class.class_name from
student right join class
on student.class_id =  class.id;

-- 5. lấy ra tất cả học viên theo học lớp C0221G1
select student.*,class.class_name from
student join class
on student.class_id =  class.id
where class.class_name ="c0221g1";
-- thông kế điểm học sinh lớn hơn 7
select point, count(*) as so_luong from
student right join class
on student.class_id =  class.id
group by point
having point>=7;

-- sắp xếp tên học viên
select * from student
order by `name` asc;
