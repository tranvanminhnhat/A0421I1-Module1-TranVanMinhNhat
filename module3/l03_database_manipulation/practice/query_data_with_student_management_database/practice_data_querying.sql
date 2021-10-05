use quan_ly_sinh_vien_new;
select * from student;

-- thuc hanh su dung cau lenh where, luu y: true tuong duong voi 1
select * from student 
where `status` = true;
select * from `subject`
where Credit < 10;

-- Thuc hanh su dung cau lenh join
select student.StudentID, student.StudentName, class.ClassName
from student join class on student.ClassID = class.ClassID
where ClassName = "A02";

-- Hien thi diem mon CF cua cac hoc vien
select student.StudentID, student.StudentName, mark.Mark, subject.SubName
from student join mark on student.StudentID = mark.StudentID 
			 join subject on mark.SubID = subject.SubID
where subject.SubName = "CF";

