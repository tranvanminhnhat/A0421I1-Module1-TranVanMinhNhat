import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {

  @Output() login = new EventEmitter()

  loginForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.minLength(10)]),
    password: new FormControl('', [Validators.required, Validators.maxLength(15)])
  });

  constructor() { }

  ngOnInit() {
  }

  onSubmit() {
    this.login.emit(this.loginForm.value)
  }
}
