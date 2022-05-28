import { Component, OnInit } from '@angular/core';
import {FormControl} from "@angular/forms";
import {DictionaryService} from "../../service/dictionary.service";
import {ActivatedRoute} from "@angular/router";
import {Iword} from "../../model/iword";

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {

  word: any;

  constructor(private activatedRoute: ActivatedRoute, private dictionaryService: DictionaryService) {
    this.activatedRoute.paramMap.subscribe(next => {
      const word = next.get("word");
      this.word = dictionaryService.translate(word);
    })
  }

  ngOnInit() {
  }
}
