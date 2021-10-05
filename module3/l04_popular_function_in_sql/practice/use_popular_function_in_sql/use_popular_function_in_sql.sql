use quan_ly_sinh_vien_new;
-- Hien thi so luong sinh vien tung noi
select Address, count(StudentID) as 'so luong hoc vien'
from student
group by Address;

-- Tinh diem trung binh cac mon hoc cua tung hoc vien
select S.StudentID, S.StudentName, avg(mark) as 'diem trung binh'
from student S
join mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName;

-- Hien thi nhung ban hoc vien co diem trung binh lon hon 10
select S.StudentID, S.StudentName, avg(Mark) as 'diem trung binh'
from student S
join mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
having avg(Mark) > 10;

-- Hien thong tin cac hoc vien co diem trung binh lon nhat
select S.StudentID, S.StudentName, avg(Mark) as 'diem trung binh'
from student S
join mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
having avg(Mark) >= all (select avg(Mark) from mark group by mark.StudentID);