create database a04_student_manager;
use a04_student_manager;
create table account_jame(
`account` varchar(50) primary key,
password varchar(50)
);
create table instructor(
id int auto_increment primary key,
name varchar(250),
birthday date
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
