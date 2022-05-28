create database patient_management;
use patient_management;

create table patient(
	patient_id varchar(45) primary key,
    patient_name varchar(255) not null
);

create table case_record(
	case_record_id varchar(45) primary key,
    case_record_start_date date not null,
    case_record_end_date date not null,
    hospitalized_reason varchar(255) not null,
    patient_id varchar(45) not null,
    foreign key(patient_id) references patient(patient_id) 
);