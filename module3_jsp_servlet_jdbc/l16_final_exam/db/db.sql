create database product_management;
use product_management;

create table category(
	category_id int primary key auto_increment,
    category_name varchar(255) not null
);

create table product(
	product_id int primary key auto_increment,
    product_name varchar(255) not null,
    product_price double not null,
    product_quantity int not null,
    product_color varchar(45),
    product_description varchar(255),
    category_id int not null,
    foreign key(category_id) references category(category_id)
);

SELECT * FROM product join category on category.category_id = product.category_id;

