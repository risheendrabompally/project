import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  
  private baseUrl = 'http://localhost:3333/api/cart';
  
    constructor(private http: HttpClient) { }

    addToCart(cart: Object): Observable<Object> {
      console.log(cart);
      return this.http.post(`${this.baseUrl}` + `/add`, cart);
    }

    deleteCartPuppy(id: number): Observable<any> {
      return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
    }
}
