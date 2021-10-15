-- Tạo một procedure không tham số, chức năng là chọn tất cả từ bảng customers
DELIMITER //
create procedure findAllCustomers()
begin
	select * from customers;
end //
DELIMITER ;

-- Gọi hàm không tham số findAllCustomers()
call findAllCustomers();

-- Mysql không cung cấp lệnh để sửa procedure, vì vậy ta sẽ drop chúng và tạo mới
DELIMITER //
drop procedure if exists findAllCustomers;
create procedure findAllCustomer()
begin
	select * from customers where customerNumber = 175;
end //
DELIMITER ;

call findAllCustomer();