import { Component, OnInit } from '@angular/core';
import {Pet} from "../pet";

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name: 'Chó Nhựt',
    image: 'https://cdn.tgdd.vn/Files/2021/04/21/1345059/nuoi-cho-muc-co-tot-khong-nhung-luu-y-khi-nuoi-cho-muc-202104210056007086.jpg'
  }


  constructor() { }

  ngOnInit() {
  }

}
