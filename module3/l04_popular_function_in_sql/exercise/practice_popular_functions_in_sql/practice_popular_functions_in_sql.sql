use quan_ly_sinh_vien_new;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subject
where Credit = (select max(Credit) from subject);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select subject.SubName, mark.Mark from subject
join mark on mark.SubID = subject.SubID
where mark.Mark = (select max(Mark) from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select S.StudentID as 'ID', S.StudentName as 'name', avg(Mark) as 'average'
from student S
join mark M on M.StudentID = S.StudentID
group by S.StudentID, S.StudentName
order by avg(Mark) desc;
