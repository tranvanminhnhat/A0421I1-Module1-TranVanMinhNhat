import { Component, OnInit } from '@angular/core';
import {DictionaryService} from "../../service/dictionary.service";
import {Iword} from "../../model/iword";
import {Form, FormControl, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {

  words: Iword[] = [];

  wordForm: FormGroup = new FormGroup({
    word: new FormControl()
  });

  constructor(private dictionaryService: DictionaryService, private router: Router) {

  }

  ngOnInit() {
    this.getAll();
  }

  getAll(){
    this.words = this.dictionaryService.findAll();
  }

  submit() {
    const word = this.dictionaryService.translate(this.wordForm.value);
    this.router.navigate(["/dictionary/detail", word])
  }
}
