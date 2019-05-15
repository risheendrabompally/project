import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { Router } from '@angular/router';
import { OwnerService } from '../owner.service';

@Component({
  selector: 'app-owner-login',
  templateUrl: './owner-login.component.html',
  styleUrls: ['./owner-login.component.css']
})
export class OwnerLoginComponent implements OnInit {

  username=null;
  name=false;
  user:User=new User();
  submitted=false;
  
  constructor(private dataService: OwnerService,private router : Router) { }

  ngOnInit() {
    
  }
  cust(){
    this.submitted=false;
    this.user=new User();
  }

  private searchCustomers() {
    
    this.dataService.loginOwner(this.user)
      .subscribe(res => {
          if(res!=null){
            localStorage.setItem('Role','owner');
            localStorage.setItem('uname',res['fullname']);
             this.router.navigateByUrl('home');
              
          }
          else
          {
            this.username="Wrong Credentials";

          }
      });
  }

  onSubmit() {
    this.submitted=true;
    this.searchCustomers();
  }

  readValue(key){
    return localStorage.getItem(key);
  }
  
}
