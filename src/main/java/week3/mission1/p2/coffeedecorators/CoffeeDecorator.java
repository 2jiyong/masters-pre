package week3.mission1.p2.coffeedecorators;

import week3.mission1.p2.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    protected Coffee coffee;

    @Override
    public String getBaseCoffee() {
        return coffee.getBaseCoffee();
    }
    public abstract void brewing();
}
