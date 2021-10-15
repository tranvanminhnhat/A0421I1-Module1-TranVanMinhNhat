-- Tham số loại IN
DELIMITER //
create procedure getCustomerById(in cusNum int(11))
begin
	select * from customers where customerNumber = cusNum;
end //
DELIMITER ;

call getCustomerById(175);

-- Tham số loại out
DELIMITER //
create procedure getCustomerCountByCity(
	in in_city varchar(50),
    out total int
)
begin
	select count(customerNumber)
    into total
    from customers
    where city = in_city;
end //
DELIMITER ;

call getCustomerCountByCity('Lyon', @total);
select @total;

-- Tham số loại inout
DELIMITER //
create procedure setCounter(
	inout counter int,
    in inc int
)
begin
	set counter = counter + inc;
end //
DELIMITER ;

set @counter = 1;
call setCounter(@counter, 1); -- 2
CALL SetCounter(@counter,1); -- 3
CALL SetCounter(@counter,5); -- 8
SELECT @counter; -- 8