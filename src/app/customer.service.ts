import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

customerList:any;

  private baseUrl = 'http://localhost:8888';
  private baseUrl2 = 'http://localhost:8888/getpuppy/api/pups';

  constructor(private http: HttpClient) { }

  getCustomer(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createCustomer(customer: Object): Observable<Object> {
    console.log(customer);
    return this.http.post(`${this.baseUrl}` + `/puppycreate/api/pups/create`, customer);
  }
  createUser(user: Object): Observable<Object> {
    console.log(user);
    return this.http.post(`${this.baseUrl}` + `/register`, user);
  }

  updateCustomer(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delpuppy/api/customers/${id}`, { responseType: 'text' });
  }

  getCustomersList():any {
    return this.http.get(`${this.baseUrl2}`);
  }

  getCustomersByAge(uname: any): Observable<any> {
    return this.http.get(`${this.baseUrl}/age/${uname}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }
  saveCinfo(cList:any){
    this.customerList=cList;

  }
}