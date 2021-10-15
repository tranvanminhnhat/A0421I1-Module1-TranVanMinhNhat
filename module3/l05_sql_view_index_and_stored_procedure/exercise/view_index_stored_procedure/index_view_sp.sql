-- Tạo database
create database demo;
use demo;
create table products(
	Id int primary key auto_increment,
    productCode varchar(20) not null,
    productName varchar(50),
    productPrice double,
    productAmount int,
    productDescription varchar(50),
    productStatus tinyint
);

alter table products modify productCode varchar(20) null;

-- Chèn dữ liệu vào bảng
insert into products (Id, productCode, productName, productPrice, productAmount, productDescription, productStatus)
values(2, "TL", "Tủ lạnh", 2500, 3, "chất lượng cao", 1),
	  (3, "MG", "Máy giặc", 3100, 5, "chất lượng cao", 0),
      (4, "NCD", "Nồi cơm điện", 500, 10, "chất lượng cao", 1),
      (5, "DH", "Điều hòa", 2000, 7, "chất lượng cao", 1);
      
-- Tạo index cho bảng trên trường productCode
create unique index idx_productCode on products(productCode);

-- Tạo composite index trên bảng products (productName và productPrice)
create index idx_productName_productPrice
on products(productName, productPrice);

-- Xóa index idx_productCode
alter table products drop index idx_productCode;
alter table products drop index idx_productName_productPrice;

-- Dùng lệnh explain để phân tích hiệu suất
explain select * from products where productName = "Tivi";

-- Tạo view
create view view_products as
select productCode, productName, productPrice, productStatus 
from products;

-- Sử dụng view
select * from view_products;

-- Sửa view (cách 1)
alter view view_products as
select productCode, productName, productPrice
from products;

-- sửa view (cách 2)
create or replace view view_products as
select productCode, productName
from products;

-- Xóa view
drop view view_products;

-- Tạo procedure
-- 1. Tạo procedure để lấy thông tin trong products
DELIMITER //
create procedure getInfoFromProducts()
begin
	select * from products;
end //
DELIMITER ;

call getInfoFromProducts;

-- 2. Tạo procedure để thêm một sản phẩm mới
DELIMITER //
create procedure addNewProduct(id int, proCode varchar(20), proName varchar(50),
proPrice double, proAmount int, proDes varchar(50), proSta tinyint)
begin
	insert into products value (id, proCode, proName, proPrice, proAmount, proDes, proSta);
end //
DELIMITER ;

call addNewProduct(6, "DH", "Đồng hồ", 600, 12, "Chất lượng cao", 1);

-- 3. Tạo procedure sửa thông tin theo id
DELIMITER //
create procedure updateProductById(
i int, proCode varchar(20), proName varchar(50),
proPrice double, proAmount int, proDes varchar(20), proSta tinyint
)
begin
	update products 
    set productCode = proCode, productName = proName, 
    productPrice = proPrice, productAmount = proAmount, 
    productDescription = proDes, productStatus = proSta
    where products.Id = i;
end //
DELIMITER ;

call updateProductById(2, "LVS", "Lò vi sóng", 2300, 4, "Chất lượng", 0);

-- Tạo procedure xóa product theo id
DELIMITER //
create procedure deleteProductById(i int)
begin
	delete from products
    where Id = i;
end //
DELIMITER ;

call deleteProductById(2);