import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {ProductService} from "../../service/product.service";
import {FormControl, FormGroup} from "@angular/forms";
import {Product} from "../../model/product";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  productForm: FormGroup;

  product: Product;

  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService, private router: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get("id");
      productService.findById(Number(id)).subscribe(data => {
        this.product = data;
        this.productForm = new FormGroup({
          id: new FormControl(this.product.id),
          name: new FormControl(this.product.name),
          price: new FormControl(this.product.price),
          description: new FormControl(this.product.description)
        })
      })
    })

  }

  ngOnInit() {
  }

  deleteProduct() {
    this.productService.deleteProduct(this.productForm.value).subscribe(next => {
      this.router.navigate([""]);
    })
  }
}
