import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {StudentService} from "../service/student.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Student} from "../model/student";

@Component({
  selector: 'app-student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {

  student: any;

  studentForm: FormGroup;

  constructor(private activatedRoute:ActivatedRoute, private studentService: StudentService, private router: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get("id");
      studentService.findById(Number(id)).subscribe(data => {
        this.student = data;
        this.studentForm = new FormGroup(
          {
            id: new FormControl(this.student.id),
            studentName: new FormControl(this.student.studentName),
            groupName: new FormControl(this.student.groupName, [Validators.pattern("[Nn][Hh][Oo][Mm][0-9]{1}")]),
            areaName: new FormControl(this.student.areaName),
            instructor: new FormControl(this.student.instructor),
            email: new FormControl(this.student.email, [Validators.pattern("[A-Za-z]{5}[@][g][m][a][i][l][.][c][o][m]")]),
            phoneNumber: new FormControl(this.student.phoneNumber, [Validators.pattern("[0-9]{10}")])
          });
      });
    }, error => {

    }, () => {

    });
  }

  ngOnInit() {
  }

  updateStudent() {
    this.studentService.updateStudent(this.studentForm.value).subscribe(next => {
      this.router.navigate([""]);
    });
  }
}
