import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CelsiusToFahrenheitPipe } from './celsius-to-fahrenheit.pipe';

@Component({
  selector: 'app-ex3',
  standalone: true,
  imports: [FormsModule, CelsiusToFahrenheitPipe],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {

  temperature: number | null = null;

}
