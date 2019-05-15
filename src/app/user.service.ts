import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8888';

  constructor(private http: HttpClient) { }

  createUser(user: Object): Observable<Object> {
    console.log(user);
    return this.http.post(`${this.baseUrl}` + `/bregister/api/borrower/register`, user);
  }

  loginUser(user: Object): Observable<Object> {
    console.log(user);
    return this.http.post(`${this.baseUrl}` + `/blogin/api/borrower/validate`, user);
  }
  

}
