CREATE DATABASE quan_ly_diem;
use quan_ly_diem;
create table HocSinh(
	maHS varchar(20) primary key,
    tenHS varchar(50),
    ngaysinh date,
    class varchar(20),
    gioitinh varchar(20)
);

create table MonHoc(
	maMH varchar(20) not null primary key,
    tenMH varchar(50)
);

create table BangDiem(
	maHS varchar(20),
    maMH varchar(20),
    diemthi double,
    ngayKT date,
    primary key (maHS, maMH),
    foreign key (maHS) references HocSinh(maHS),
    foreign key (maMH) references MonHoc(maMH)
);

create table GiaoVien(
	maGV varchar(20) not null primary key,
    tenGV varchar(20),
    sdt varchar(10)
);

alter table MonHoc add maGV varchar(20);
alter table MonHoc add constraint FK_MaGV foreign key(maGV) references GiaoVien(maGV);