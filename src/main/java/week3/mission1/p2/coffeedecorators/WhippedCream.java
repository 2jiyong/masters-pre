package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public class WhippedCream extends CoffeeDecorator{
    public WhippedCream(Coffee coffee){
        super(coffee);
    }

    @Override
    public void brewing(){
        coffee.brewing();
        System.out.print("Adding Whipped Cream ");
    }
}
