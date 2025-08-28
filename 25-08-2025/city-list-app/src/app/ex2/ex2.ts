import { Component, inject } from '@angular/core';
import { FormBuilder, Validators, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatStepperModule } from '@angular/material/stepper';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-ex2',
  standalone: true,
  imports: [
    MatButtonModule,
    MatStepperModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
  ],
  templateUrl: './ex2.html',
  styleUrl: './ex2.css'
})
export class Ex2 {
  private fb = inject(FormBuilder);

  nameForm = this.fb.group({
    nameCtrl: ['', [Validators.required, Validators.minLength(2)]],
  });

  ageForm = this.fb.group({
    ageCtrl: [null, [Validators.required, Validators.min(1), Validators.max(120)]],
  });

  emailForm = this.fb.group({
    emailCtrl: ['', [Validators.required, Validators.email]],
  });

  isLinear = false; 
}
