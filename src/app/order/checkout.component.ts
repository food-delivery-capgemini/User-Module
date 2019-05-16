import { Component } from '@angular/core';
import { DishService } from './dish.service';
import { ActivatedRoute } from '@angular/router';
import { Dish } from './dish';
import { Users } from '../customer/user';
import { Address } from '../user';

@Component({
    templateUrl:"./checkout.component.html"  
})
export class CheckoutComponent{
    dishes:Dish[];
    user1:Users;
    address:Address;
    user:Users;

    constructor(private dishService: DishService,
        private route: ActivatedRoute) { }

      
 



        ngOnInit(): void {

            this.user=new Users();
            this .address=new Address();
  
            this.user1=JSON.parse(sessionStorage.getItem('user'));
    console.log(this.user1);

            this.dishService.findAllDishes().subscribe(data=>{
                console.log(data);
                this.dishes=data;

            },err=>{
                console.log(err);
            })
        
   
   
   }


   addAddress(){
       alert("Hello");
       console.log(this.user.address.city);
   }
}