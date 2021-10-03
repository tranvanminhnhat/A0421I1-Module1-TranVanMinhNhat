create database QuanLyBanHang;
use QuanLyBanHang;

create table Customer(
	CustomerID varchar(20) primary key,
    CustomerName varchar(50) not null,
    CustomerAge int
);

create table `Order`(
	OrderID varchar(20) primary key,
    CustomerID varchar(20) not null,
    OrderDate date,
    OrderTotalPrice double,
    foreign key (CustomerID) references Customer(CustomerID)
);

create table Product(
	ProductID varchar(20) primary key,
    ProductName varchar(50) not null,
    ProductPrice double
);

create table OrderDetail(
	OrderID varchar(20),
    ProductID varchar(20),
    OdQTY varchar(20),
    constraint pk_order_detail primary key (OrderID, ProductID),
    foreign key (OrderID) references `Order`(OrderID),
    foreign key (ProductID) references Product(ProductID)
);




