package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
        baseCoffee = coffee.baseCoffee;
    }

    public abstract void brewing();
}
