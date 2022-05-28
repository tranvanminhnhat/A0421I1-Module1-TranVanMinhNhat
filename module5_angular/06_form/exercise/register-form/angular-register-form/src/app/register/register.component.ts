import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {IUser} from "../iuser";


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  @Output() submitCreate = new EventEmitter();
  registerForm: FormGroup;

  users: IUser[] = [];

  constructor() {
    this.registerForm = new FormGroup({
      firstname: new FormControl(),
      lastname: new FormControl(),
      password: new FormControl()
    })
  }

  ngOnInit() {
  }

  onSubmit() {
    this.users.push(this.registerForm.value)
    console.log(this.users)
  }
}
