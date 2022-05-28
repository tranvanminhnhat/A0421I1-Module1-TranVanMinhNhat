import { Component, OnInit } from '@angular/core';
import {Product} from "../../model/product";
import {ProductService} from "../../service/product.service";
import {Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  productList = [];
  product: Product;
  searchForm: FormGroup;


  constructor(private productService: ProductService, private router: Router) {
    productService.findAll().subscribe(next => {
      this.productList = next;
    })

    this.searchForm = new FormGroup({
      id: new FormControl()
    })
  }

  ngOnInit() {
  }

  updateProduct(product: any) {
    this.router.navigate(["/product/update", product.id]);
  }

  deleteProduct(product: any) {
    this.router.navigate(["/product/delete", product.id]);
  }

  search() {
    this.productService.search(this.searchForm.value).subscribe(next => {
      this.productList = [];
      this.productList.push(next)
    })
  }
}
