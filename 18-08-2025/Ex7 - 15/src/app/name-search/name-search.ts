import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-name-search',
  imports: [CommonModule, FormsModule],
  templateUrl: './name-search.html',
  styleUrl: './name-search.css'
})
export class NameSearch {
  searchText: string = '';

  names: string[] = ['Jayanta', 'Jayaram', 'Sneha', 'Divya', 'Amit', 'Tejaswini', 'Memanasa'];

  get filteredNames(): string[] {
    if (!this.searchText) return this.names;
    const text = this.searchText.toLowerCase();
    return this.names.filter(name => name.toLowerCase().startsWith(text));
  }

}
