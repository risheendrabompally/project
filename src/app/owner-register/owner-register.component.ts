import { Component, OnInit } from '@angular/core';
import { OwnerService } from '../owner.service';
import { User } from '../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-owner-register',
  templateUrl: './owner-register.component.html',
  styleUrls: ['./owner-register.component.css']
})
export class OwnerRegisterComponent implements OnInit {

  user: User = new User();
  submitted = false;

  constructor( private service :OwnerService,private router : Router) { }

  ngOnInit() {
  
  }

  newCustomer(): void {
    this.submitted = false;
    this.user = new User();
  }

  save() {
    this.service.createOwner(this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new User();
    localStorage.setItem('loginmsg','You have successfully Registered, Login to Continue');
    this.router.navigateByUrl('ownerLogin');
  }

  onSubmit() {
    this.save();
  }
}
