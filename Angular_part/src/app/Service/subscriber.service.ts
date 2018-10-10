import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Customers } from '../Model/Customers';

@Injectable({
  providedIn: 'root'
})
export class SubscriberService {

  baseUrl: string;

  constructor(private http: Http) {
    this.baseUrl = "http://localhost:9191/myinfo/111111";
  }

  getSubscriberByRmn(): Observable<Customers> {
    return this.http.get(this.baseUrl).pipe(
      map(data => data.json())
    );
  }

}
