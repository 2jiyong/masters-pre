package week3.mission1.p2.basecoffee;

import week3.mission1.p2.Coffee;

public class EtiopiaAmericano extends Coffee {
    public EtiopiaAmericano() {
        baseCoffee = "Etiopia";
    }
    @Override
    public void brewing() {
        System.out.print("EtiopiaAmericano ");
    }
}
