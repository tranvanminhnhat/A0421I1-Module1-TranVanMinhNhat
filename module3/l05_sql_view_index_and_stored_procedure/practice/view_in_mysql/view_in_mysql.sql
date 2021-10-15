-- tạo view
create view customer_view as
select customerNumber, customerName, phone
from customers;

-- truy vấn bảng ảo (view)
select * from customer_view;

-- cập nhật view
create or replace view customer_view as
select customerNumber, customerName, contactFirstName, contactLastName
from customers
where city = 'Nantes';

select * from customer_view;