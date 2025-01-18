package week2.mission2.p3;

public class Originator {
    private int fruitNumber;
    private int money;
    private Fruit[] fruits = new Fruit[3];

    public Originator(){
        money = 1000;
        fruitNumber = 0;
        fruits[0] = new Fruit("사과", 0);
        fruits[1] = new Fruit("샤인머스켓", 0);
        fruits[2] = new Fruit("귤", 0);
    }

    public boolean hasMoreMoneyThanMemento(Memento memento){
        return money > memento.savedMoney;
    }

    public boolean hasLessThanHalfMoneyOfMemento(Memento memento){
        return money < memento.savedMoney/2;
    }

    public Memento createMemento(){
        return new Memento(money, fruitNumber, fruits);
    }

    public void setMemento(Memento memento){
        money = memento.savedMoney;
        fruitNumber = memento.savedFruitNumber;
        for (int i=0; i<3; i++){
            fruits[i] = new Fruit(memento.savedFruits[i].getFruitName(),memento.savedFruits[i].getCount());
        }
    }

    public  int getFruitNumber() {
        return fruitNumber;
    }

    public void setFruitNumber(int fruitNumber) {
        this.fruitNumber = fruitNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Fruit[] getFruits() {
        return fruits;
    }

    public void setFruits(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public static class Memento{
        private int savedMoney;
        private int savedFruitNumber;
        private Fruit[] savedFruits = new Fruit[3];

        private Memento(int money, int fruitNumber, Fruit[] fruits){
            this.savedMoney = money;
            this.savedFruitNumber = fruitNumber;
            for (int i=0; i<3; i++){
                this.savedFruits[i] = new Fruit(fruits[i].getFruitName(),fruits[i].getCount());
            }
        }
    }
}
