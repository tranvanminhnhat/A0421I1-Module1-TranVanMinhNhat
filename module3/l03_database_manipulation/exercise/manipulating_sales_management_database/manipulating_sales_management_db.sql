use quanlybanhang;

-- Them du lieu vao bang
INSERT INTO `quanlybanhang`.`customer` (`CustomerID`, `CustomerName`, `CustomerAge`) VALUES 
(1, 'MinhQuan', 10),
(2, 'Ngoc Oanh', 20),
(3, 'Hong Ha', 50);

INSERT INTO `quanlybanhang`.`order` (`OrderID`, `CustomerID`, `OrderDate`, `OrderTotalPrice`) VALUES
(2, 2, '2006-03-21', null),
(3, 1, '2006-03-16', null);

INSERT INTO `quanlybanhang`.`product` (`ProductID`, `ProductName`, `ProductPrice`) VALUES 
(1, 'May Giat', 3),
(2, 'Tu Lanh', 5),
(3, 'Dieu Hoa', 7),
(4, 'Quat', 1),
(5, 'Bep Dien', 2);

INSERT INTO `quanlybanhang`.`orderdetail` (`OrderID`, `ProductID`, `OdQTY`) VALUES 
(1, 1, 3),
(1, 3, 7),
(1, 4, 2),
(2, 1, 1),
(3, 1, 8),
(2, 5, 4),
(2, 3, 3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select `order`.OrderID, `order`.OrderDate, `order`.OrderTotalPrice from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select `customer`.CustomerID as ID, `customer`.CustomerName as Name, `product`.ProductName as Product
from `customer` join `order` on `order`.CustomerID = `customer`.CustomerID
join orderdetail on orderdetail.OrderID = `order`.OrderID
join product on product.ProductID = orderdetail.ProductID;

-- Tu day tro xuong chua hoan thanh
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.CustomerID as ID, customer.CustomerName as Name
from customer 
where customer.CustomerID not in (select `order`.CustomerID from `order`);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select `order`.OrderID, `order`.OrderDate, sum(orderdetail.OdQTY * product.ProductPrice) as 'tong tien'
from `order` join orderdetail on `order`.OrderID = orderdetail.OrderID
join product on product.ProductID = orderdetail.ProductID
group by `order`.OrderID;

