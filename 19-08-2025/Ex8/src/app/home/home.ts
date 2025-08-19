import { Component } from '@angular/core';
import { ITask } from '../models/task.interface';
import { TaskList } from '../task-list/task-list';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [TaskList, FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  tasks: ITask[] = [];
  newDescription: string = '';
  newCategory: string = 'Work';

  addTask() {
    if (this.newDescription.trim()) {
      const uniqueId = Date.now(); 
      this.tasks.push({
        id: uniqueId,
        description: this.newDescription,
        category: this.newCategory
      });
      this.newDescription = '';
    }
  }

  removeTask(id: number) {
    this.tasks = this.tasks.filter(task => task.id !== id);
  }
}
