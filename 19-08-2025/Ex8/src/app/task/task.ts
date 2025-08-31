import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ITask } from '../models/task.interface';

@Component({
  selector: 'app-task',
  standalone: true,
  templateUrl: './task.html',
  styleUrl: './task.css'
})
export class Task {
  @Input() task!: ITask;
  @Output() delete = new EventEmitter<number>();

}
