import { Injectable } from '@angular/core';
import {Iword} from "../model/iword";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  words: Iword[] = [
    {
      word: 'hello',
      mean: 'xin chao'
    },
    {
      word: 'goodbye',
      mean: 'tam biet'
    }
  ];

  constructor() { }

  translate(word: string){
    for (let i of this.words){
      if (i.word === word){
        return i;
      }
    }
    return null;
  }

  findAll(){
    return this.words;
  }
}
