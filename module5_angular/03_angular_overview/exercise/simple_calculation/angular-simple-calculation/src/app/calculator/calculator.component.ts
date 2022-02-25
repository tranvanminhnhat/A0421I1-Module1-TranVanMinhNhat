import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  a;
  b;
  result;
  constructor() { }

  sum(a,b){
    this.result = parseFloat(a) + parseFloat(b);
    return this.result;
  }

  subtract(a,b){
    this.result = a - b;
    return this.result;
  }

  dvide(a, b){
    this.result = a / b;
    return this.result;
  }

  multiple(a,b){
    this.result = a * b;
    return this.result;
  }
  ngOnInit() {
  }

}
