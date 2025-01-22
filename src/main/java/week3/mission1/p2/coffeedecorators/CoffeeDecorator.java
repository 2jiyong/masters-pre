package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public abstract void brewing();
}
