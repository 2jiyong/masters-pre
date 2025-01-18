package week2.mission2.p1;

public class Car {
    private static int serialNumber = 1000;
    private int carNumber;

    public Car(){
        this.carNumber = serialNumber++;
    }

    public int showCarNumber(){
        return this.carNumber;
    }
}
