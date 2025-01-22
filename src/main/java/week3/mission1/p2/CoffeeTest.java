package week3.mission1.p2;

import week3.mission1.p2.basecoffee.BrazilAmericano;
import week3.mission1.p2.basecoffee.EtiopiaAmericano;
import week3.mission1.p2.basecoffee.HawaiiAmericano;
import week3.mission1.p2.basecoffee.KenyaAmericano;
import week3.mission1.p2.coffeedecorators.Latte;
import week3.mission1.p2.coffeedecorators.Mocha;
import week3.mission1.p2.coffeedecorators.WhippedCream;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha =
                new WhippedCream(new Mocha(new Latte( new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}
