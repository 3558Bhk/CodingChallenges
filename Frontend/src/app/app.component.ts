import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'SalesDashboardApplication';
}
// loadReports(): void {
//   this.reportsService.calculateTotalSales().subscribe(data => this.totalSales = data);
//   this.reportsService.calculateTotalCashSale().subscribe(data => this.totalCashSales = data);
//   this.reportsService.calculateTotalCreditCardSale().subscribe(data => this.totalCreditCardSales = data);
//   this.reportsService.calculateBuyerWithMostSale().subscribe(data => this.buyerWithMostSale = data);}