import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "../model/product";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  public apiURL = "http://localhost:3000/products";
  constructor(private http: HttpClient) {
  }

  findAll():Observable<Product[]>{
    return this.http.get<Product[]>(this.apiURL);
  }

  createProduct(product: Product) :Observable<any> {
    return this.http.post<any>(this.apiURL, product);
  }

  findById(id: number): Observable<Product> {
    return this.http.get<Product>(this.apiURL +"/"+id);
  }

  updateProduct(product: Product) {
    return this.http.patch<Product>(this.apiURL + "/" + product.id, product);
  }

  deleteProduct(product: Product) {
    return this.http.delete<Product>(this.apiURL + "/" + product.id);
  }

  search(product: any): Observable<any> {
    return this.http.get<Product>(this.apiURL +"/"+product.id);
  }
}
