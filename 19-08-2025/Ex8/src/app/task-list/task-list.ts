import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ITask } from '../models/task.interface';
import { Task } from '../task/task';

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [Task],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css'
})
export class TaskList {
  @Input() tasks: ITask[] = [];
  @Output() remove = new EventEmitter<number>();

  onDelete(task: any) {
  console.log("Deleting task:", task); 
  this.remove.emit(task.id);            
}

}
