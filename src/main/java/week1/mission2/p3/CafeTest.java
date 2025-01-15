package week1.mission2.p3;

public class CafeTest {
    public static void main(String[] args) {
        Person james = new Person("James", 5000);
        Person tomas = new Person("Tomas", 10000);
        Cafe byul = new Cafe("별다방","아메리카노",4000);
        Cafe kong = new Cafe("콩다방" , "라떼", 5000);

        james.drinkCoffee(byul);
        tomas.drinkCoffee(kong);

        james.showPersonInfo();
        tomas.showPersonInfo();
    }
}
