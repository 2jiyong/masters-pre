package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public class Latte extends CoffeeDecorator{
    public Latte(Coffee coffee){
        super(coffee);
    }
    public void brewing(){
        coffee.brewing();
        if (coffee.baseCoffee.equals("Brazil") || coffee.baseCoffee.equals("Etiopia") || coffee.baseCoffee.equals("Hawaii") || coffee.baseCoffee.equals("Kenya")){
            System.out.print("Adding Milk ");
        }

    }
}
