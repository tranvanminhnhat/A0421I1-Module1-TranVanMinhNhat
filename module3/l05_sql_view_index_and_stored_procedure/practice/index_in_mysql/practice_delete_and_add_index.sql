-- Chọn tất cả các trường của bảng customers, điều kiện customerName = 'Land of Toys Inc.'
select * from customers 
where customerName = 'Land of Toys Inc.';

-- Phân tích lệnh truy vấn dưới khi chưa sử dụng index
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

-- Tạo index cho bảng customers trên cột customerName có tên là index_customerName
alter table customers add index index_customerName(customerName);

-- Phân tích câu truy vấn sau khi sử dụng index
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

-- Chúng ta có thể add index cho nhiều cột
alter table customers add index index_full_name(contactFirstName, contactLastName);

-- Phân tích câu truy vấn sau khi dã add index cho hai cột
EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

-- Xóa index
alter table customers drop index index_full_name;

