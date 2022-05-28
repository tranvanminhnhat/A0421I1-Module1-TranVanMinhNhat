import {Component, Input, OnInit} from '@angular/core';
import {Student} from "../model/student";
import {ActivatedRoute, Router} from "@angular/router";
import {StudentService} from "../service/student.service";
import {FormControl, FormGroup} from "@angular/forms";

//metadata
@Component({
  selector: 'app-student-info',
  templateUrl: './student-info.component.html',
  styleUrls: ['./student-info.component.css']
})
export class StudentInfoComponent implements OnInit {
  student: Student;

  studentForm: FormGroup

  constructor(private activatedRoute: ActivatedRoute, private studentService: StudentService, private router: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get("id");
      studentService.findById(Number(id)).subscribe(data => {
        this.student = data;
        this.studentForm = new FormGroup(
          {
            id: new FormControl(this.student.id),
            studentName: new FormControl(this.student.studentName),
            groupName: new FormControl(this.student.groupName),
            areaName: new FormControl(this.student.areaName),
            instructor: new FormControl(this.student.instructor),
            email: new FormControl(this.student.email),
            phoneNumber: new FormControl(this.student.phoneNumber)
          });
      });
    }, error => {

    }, ()=> {

    })
  }

  ngOnInit(): void {
  }
  changeNameStudent(event: any) {
    this.student.studentName = event.value;
  }

  deleteStudent() {
    this.studentService.deleteStudent(this.studentForm.value).subscribe(next => {
      this.router.navigate([""]);
    });
  }
}
