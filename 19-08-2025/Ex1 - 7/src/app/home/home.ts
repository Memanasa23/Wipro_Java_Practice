import { Component } from '@angular/core';
// import { DisplayList } from '../display-list/display-list';
import { CommonModule } from '@angular/common';
// import { Ex5fruit } from '../ex5fruit/ex5fruit';
import { IFruit } from '../ex5fruit/ex5fruit.interface';
import { Ex5fruit } from '../ex5fruit/ex5fruit'; 
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, Ex5fruit],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  fruits: IFruit[] = [
    { 
      name: 'Apple', 
      image: 'https://images.pexels.com/photos/206959/pexels-photo-206959.jpeg?cs=srgb&dl=pexels-pixabay-206959.jpg&fm=jpg', 
      description: 'A sweet red fruit.' 
    },
    { 
      name: 'Banana', 
      image: 'https://www.bbassets.com/media/uploads/p/xl/10000025_32-fresho-banana-robusta.jpg', 
      description: 'A long yellow fruit.' 
    },
    { 
      name: 'Orange', 
      image: 'https://images.pexels.com/photos/327098/pexels-photo-327098.jpeg?cs=srgb&dl=pexels-pixabay-327098.jpg&fm=jpg', 
      description: 'A citrus fruit rich in vitamin C.' 
    },
    { 
      name: 'Mango', 
      image: 'https://aamrai.com/wp-content/uploads/2023/12/KESAR-scaled.jpg', 
      description: 'A tropical stone fruit.' 
    }
  ];

  remove(fruitName: string) {
    console.log("Remove button clicked-" + fruitName);
    this.fruits = this.fruits.filter(fruit => fruit.name !== fruitName);
  }

}
