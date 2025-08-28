import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-ex5',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatButtonModule
  ],
  templateUrl: './ex5.html',
  styleUrl: './ex5.css'
})
export class Ex5 {

  registrationForm: FormGroup;
  subjects: string[] = ['Java', 'Python', 'SQL', 'JS'];

  constructor(private fb: FormBuilder) {
    this.registrationForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      dob: ['', Validators.required],
      subject: ['', Validators.required],
    });
  }

  isInvalid(controlName: string, error: string): boolean {
    const control = this.registrationForm.get(controlName);
    return !!(control?.hasError(error) && control?.touched);
  }

  onSubmit() {
    if (this.registrationForm.valid) {
      console.log('Form Submitted:', this.registrationForm.value);
      alert('Form Submitted Successfully!');
    }
  }

}
