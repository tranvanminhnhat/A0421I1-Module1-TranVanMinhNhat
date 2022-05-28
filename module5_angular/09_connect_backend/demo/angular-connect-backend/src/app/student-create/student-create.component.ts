import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Student} from "../model/student";
import {AbstractControl, FormControl, FormGroup, NgForm, Validators} from "@angular/forms";
import {StudentService} from "../service/student.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
    studentForm: FormGroup;

  constructor(private studentService: StudentService, private router: Router) {
    this.studentForm = new FormGroup({
      id: new FormControl("",[Validators.required]),
      studentName: new FormControl("Name",[Validators.required,Validators.minLength(10)]),
      groupName: new FormControl("", [Validators.pattern("[Nn][Hh][Oo][Mm][0-9]{1}")]),
      areaName: new FormControl(),
      instructor: new FormControl(),
      email: new FormControl("", [Validators.pattern("[A-Za-z]{5}[@][g][m][a][i][l][.][c][o][m]")]),
      phoneNumber: new FormControl("", [Validators.pattern("[0-9]{10}")])
    })
  }

  ngOnInit(): void {
  }

  createStudent() {
     this.studentService.createStudent(this.studentForm.value).subscribe(next => {
       this.router.navigate([""]);
     });

  }
}
