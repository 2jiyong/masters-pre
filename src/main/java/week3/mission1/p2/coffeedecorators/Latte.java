package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public class Latte extends CoffeeDecorator{
    public Latte(Coffee coffee){
        super(coffee);
    }
    public void brewing(){
        coffee.brewing();
        System.out.print("Adding Milk");
    }

}
