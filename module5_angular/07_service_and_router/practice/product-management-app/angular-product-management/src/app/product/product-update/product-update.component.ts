import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {ProductService} from "../../service/product.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {

  productForm: FormGroup;

  product:any;

  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService, private router: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get("id");
      this.product = productService.findById(Number(id));
      this.productForm = new FormGroup(
        {
          id: new FormControl(this.product.id),
          name: new FormControl(this.product.name),
          price: new FormControl(this.product.price),
          description: new FormControl(this.product.description)
        }
      )
    })
  }

  ngOnInit() {
  }

  updateProduct() {
    this.productService.updateProduct(this.productForm.value);
    this.router.navigate(["/product/list"]);
  }
}
