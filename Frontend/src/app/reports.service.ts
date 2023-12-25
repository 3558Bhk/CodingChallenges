// client/src/app/reports.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReportsService {
  private baseUrl = 'http://localhost:8080'; // Update with your Spring Boot API URL

  constructor(private http: HttpClient) {}

  calculateTotalSales(): Observable<number> {
    return this.http.get<number>(`${this.baseUrl}/calculateTotalSales`);
  }

  calculateTotalCashSale(): Observable<number> {
    return this.http.get<number>(`${this.baseUrl}/calculateTotalCashSales`);
  }

  calculateTotalCreditCardSale(): Observable<number> {
    return this.http.get<number>(`${this.baseUrl}/calculateTotalCreditCardSales`);
  }

  calculateBuyerWithMostSale(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/fetchPersonWithMostSales`);
  }
}
