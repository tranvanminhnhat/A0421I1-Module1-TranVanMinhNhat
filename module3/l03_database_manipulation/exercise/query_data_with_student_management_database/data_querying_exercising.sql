use quan_ly_sinh_vien_new;
select * from student;

INSERT INTO student (StudentID, StudentName, Address, Phone, Status, ClassID) VALUES 
(5, 'Hai', 'Quang Ngai', '234632452', 1, 3);
INSERT INTO mark (MarkID, SubID, StudentID, Mark, ExamTimes) VALUES 
(13, 4, 4, 6, 2),
(14, 5, 5, 6, 3);


-- Hien thi tat ca sinh vien bat dau bang chu h
select * from student
where StudentName like "H%";

-- Hien thi tat ca thong tin lop hoc bat dau vao thang 12
select * from class
where StartDate like "%10%";

-- Hien thi tat ca thong tin mon hoc co credit trong khoang tu 3-5
select * from `subject`
where Credit between 3 and 5;

-- Thay doi ma lop (classID) cua sinh vien co ten Hung thanh 2
UPDATE `student` SET `ClassID` = 2 WHERE (`StudentID` = 1);

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.StudentName, `subject`.SubID, mark.Mark
from student join mark on student.StudentID = mark.StudentID 
join subject on mark.SubID = subject.SubID
Order by mark desc, StudentName asc;



