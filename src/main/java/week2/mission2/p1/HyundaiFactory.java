package week2.mission2.p1;

public class HyundaiFactory {
    private static HyundaiFactory instance = new HyundaiFactory();

    private HyundaiFactory(){}

    public static HyundaiFactory getFactory(){
        if (instance==null){
            return instance=new HyundaiFactory();
        }
        return instance;
    }

    public Car createCar(){
        return new Car();
    }

}
