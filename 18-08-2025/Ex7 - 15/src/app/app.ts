import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  // Ex7-9
  // myName: string = '';

  // printName() {
  //   console.log("Entered Name: " + this.myName);
  //   alert("Entered Name: " + this.myName);
  // }

  // EX10
  // nameList: string[] = ["Sneha", "Divya", "Amit", "Tejaswini", "Memanasa"];

  // Ex11
  // showMessage: boolean = false;

  // E12
  countries: string[] = ["India", "USA", "UK", "Canada", "Germany", "Australia"];
  dropdownList: string[] = [];  

  loadCountries() {
    this.dropdownList = this.countries;
  }
}

