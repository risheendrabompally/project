import { Component, OnInit, Input } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { DomSanitizer, SafeResourceUrl, SafeUrl } from '@angular/platform-browser';


import { CustomersListComponent } from '../customers-list/customers-list.component';
import { Cart } from 'src/app/cart';
import { CartService } from 'src/app/cart.service';

@Component({
  selector: 'customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  @Input() customer: Customer;
  customerList:any;
  currentCustomer:any;
   cart: Cart=new Cart();

  constructor(private customerService: CustomerService,private cartservice: CartService, private listComponent: CustomersListComponent,private _sanitizer: DomSanitizer) { }

  ngOnInit() {
  
  }

  // updateActive(isActive: boolean) {
  //   this.customerService.updateCustomer(this.customer.id,
  //     { name: this.customer.name, age: this.customer.age, active: isActive })
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.customer = data as Customer;
  //       },
  //       error => console.log(error));
  // }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.customer.id)
      .subscribe(
        data => {
          console.log(data);
          this.listComponent.reloadData();
        },
        error => console.log(error));
  }


  readLocalStorageValue(key) {
    return localStorage.getItem(key);
}

addCart(id:string){
  this.customerList=this.customerService.customerList;
  console.log(id);
  console.log(this.customerList);
  for(let customer of this.customerList){
  if(id==customer.id){
    console.log("its there")
  this.currentCustomer=customer;
}

  }
  console.log(this.currentCustomer);
  this.cart.customer=this.currentCustomer;
  console.log(this.cart)

 
  // this.cart.customer=this.currentCustomer;
   this.cartservice.addToCart(this.cart)
      .subscribe(data => console.log(data), error => console.log(error));
    this.cart = new Cart();
   console.log('gaya')
    
}

}
