create database student_management_1;
use `student_management_1`;
create table class(
	id int not null,
    `name` varchar(255),
    primary key(id)
);

create table teacher(
	id int not null,
    `name` varchar(255),
    age int,
    country varchar(255),
    primary key(id)
);

create table student(
	id int not null,
    `name` varchar(255) null,
    age int null,
    country varchar(255) null,
    primary key(id)
);