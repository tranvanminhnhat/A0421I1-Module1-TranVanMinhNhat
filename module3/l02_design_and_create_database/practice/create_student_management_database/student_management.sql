create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
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