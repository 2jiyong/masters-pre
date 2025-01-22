package week3.mission1.p2.basecoffee;

import week3.mission1.p2.Coffee;

public class HawaiiAmericano extends Coffee {
    public HawaiiAmericano() {
        baseCoffee = "Hawaii";
    }
    @Override
    public void brewing() {
        System.out.print("HawaiiAmericano ");
    }
}
