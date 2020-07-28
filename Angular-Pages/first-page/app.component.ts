import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'first-project';
  images = [  
    { img: "assets/images/1.jpg" },  
    { img: "assets/images/2.jpg" },  
    { img: "assets/images/3.jpg" },  
    { img: "assets/images/4.jpg" },  
    { img: "assets/images/5.jpg" },  
    { img: "assets/images/6.jpg" },    
  ];  
  
  slideConfig = {  
    "slidesToShow": 2,  
    "slidesToScroll": 1,  
    "dots": true,  
    "infinite": true,
    autoplay:true,
    autoplaySpeed:2000,
  };
}
