import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OwnerService {

  private baseUrl = 'http://localhost:8888';

  constructor(private http: HttpClient) { }

  loginOwner(user: Object): Observable<Object> {
    console.log(user);
    return this.http.post(`${this.baseUrl}` + `/ologin/api/owner/validate`, user);
  }
  createOwner(user: Object): Observable<Object> {
    console.log(user);
    return this.http.post(`${this.baseUrl}` + `/oregister/api/owner/register`, user);
  }
}
