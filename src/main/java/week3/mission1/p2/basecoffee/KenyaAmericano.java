package week3.mission1.p2.basecoffee;

import week3.mission1.p2.Coffee;

public class KenyaAmericano implements Coffee {
    @Override
    public String getBaseCoffee() {
        return "Kenya";
    }

    @Override
    public void brewing() {
        System.out.print("KenyaAmericano ");
    }
}
