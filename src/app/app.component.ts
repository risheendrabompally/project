import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private router : Router) { }
  title = 'JavaSampleApproach';
  description = 'Angular-SpringBoot';

  readLocalStorageValue(key) {
    return localStorage.getItem(key);
}
logout(){
  localStorage.setItem('Role','nothing');
  localStorage.setItem('loginmsg','nothing');
  localStorage.setItem('uname','nothing');
  this.router.navigateByUrl('home');
}
}
