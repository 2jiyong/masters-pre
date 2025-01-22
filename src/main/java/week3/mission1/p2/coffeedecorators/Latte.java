package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public class Latte extends CoffeeDecorator{
    public Latte(Coffee coffee){
        super(coffee);
    }

    @Override
    public void brewing(){
        coffee.brewing();
        if (coffee.getBaseCoffee().equals("Brazil") || coffee.getBaseCoffee().equals("Etiopia") || coffee.getBaseCoffee().equals("Hawaii") || coffee.getBaseCoffee().equals("Kenya")){
            System.out.print("Adding Milk ");
        }

    }
}
