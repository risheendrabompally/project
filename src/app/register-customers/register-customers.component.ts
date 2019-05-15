import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { UserService } from '../user.service';
import { User } from '../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register-customers',
  templateUrl: './register-customers.component.html',
  styleUrls: ['./register-customers.component.css']
})
export class RegisterCustomersComponent implements OnInit {

  user: User = new User();
  submitted = false;

  constructor( private service :UserService,private router : Router) { }

  ngOnInit() {
  
  }

  newCustomer(): void {
    this.submitted = false;
    this.user = new User();
  }

  save() {
    this.service.createUser(this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new User();
    localStorage.setItem('loginmsg','You have successfully Registered, Login to Continue');
    this.router.navigateByUrl('login');
  }

  onSubmit() {
    this.save();
  }
}
