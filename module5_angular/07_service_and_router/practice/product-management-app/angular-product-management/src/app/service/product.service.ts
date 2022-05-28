import { Injectable } from '@angular/core';
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [{
    id: 1,
    name: 'IPhone 12',
    price: 2400000,
    description: 'New'
  }, {
    id: 2,
    name: 'IPhone 11',
    price: 1560000,
    description: 'Like new'
  }, {
    id: 3,
    name: 'IPhone X',
    price: 968000,
    description: '97%'
  }, {
    id: 4,
    name: 'IPhone 8',
    price: 7540000,
    description: '98%'
  }, {
    id: 5,
    name: 'IPhone 11 Pro',
    price: 1895000,
    description: 'Like new'
  }];

  constructor() { }

  getALl(){
    return this.products;
  }

  saveProduct(product){
    this.products.push(product);
  }

  findById(id:number){
    for (let i of this.products){
      if (i.id === id){
        return i;
      }
    }
    return null;
  }

  updateProduct(product: Product){
    this.products.pop();



    for (let i; i < this.products.length; i++){
      if (this.products[i].id === product.id){
          this.products[i].name = product.name;
          this.products[i].price = product.price;
          this.products[i].description = product.description;
          console.log(this.products[i]);
      }
    }
  }
}
