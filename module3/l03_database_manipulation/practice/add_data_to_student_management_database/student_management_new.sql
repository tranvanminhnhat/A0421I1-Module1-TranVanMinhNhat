create database quan_ly_sinh_vien_new;
use quan_ly_sinh_vien_new;
create table class(
	ClassID int auto_increment primary key,
    ClassName varchar(60) not null,
    StartDate datetime not null,
    `Status` bit
);

create table student(
	StudentID int auto_increment primary key,
    StudentName varchar(30) not null,
    Address varchar(50),
    Phone varchar(20),
    `Status` bit,
    ClassID int not null,
    foreign key (ClassID) references class(ClassID)
);

create table `subject`(
	SubID int auto_increment primary key,
    SubName varchar(30) not null,
    Credit tinyint not null default 1,
    `Status` bit default 1,
    check (Credit >= 1)
);

create table mark(
	MarkID int auto_increment primary key,
    SubID int not null unique,
    StudentID int not null unique,
    Mark float default 0,
    ExamTimes tinyint default 1,
    check (Mark >= 0 and Mark <=100),
    foreign key (SubID) references `subject`(SubID),
    foreign key (StudentID) references student(StudentID)
);

insert into class values (1, "A01", "2021-05-20", 1);
insert into class values (2, "A02", "2021-06-27", 1);
insert into class values (3, "A03", current_date, 1);

INSERT INTO `subject`
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO student (StudentName, Address, `Status`, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO student (StudentName, Address, Phone, `Status`, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO mark (SubID, StudentID, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (3, 2, 10, 2),
       (2, 3, 12, 1);