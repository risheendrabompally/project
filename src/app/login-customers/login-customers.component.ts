import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { User } from '../user';


@Component({
  selector: 'app-login-customers',
  templateUrl: './login-customers.component.html',
  styleUrls: ['./login-customers.component.css']
})
export class LoginCustomersComponent implements OnInit {

  username=null;
  name=false;
  user:User=new User();
  submitted=false;
  
  
  constructor(private dataService: UserService,private router : Router) { }

  ngOnInit() {
    
  }
  cust(){
    this.submitted=false;
    this.user=new User();
  }

  private searchCustomers() {
    
    this.dataService.loginUser(this.user)
      .subscribe(res => {
        
          if(res!=null){
            console.log(res['fullname']);
            localStorage.setItem('uname',res['fullname']);
            localStorage.setItem('Role',' ');
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