package week3.mission1.p2.basecoffee;

import week3.mission1.p2.Coffee;

public class BrazilAmericano extends Coffee {
    public BrazilAmericano() {
        baseCoffee = "Brazil";
    }
    @Override
    public void brewing() {
        System.out.print("BrazilAmericano ");
    }
}
