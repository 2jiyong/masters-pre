package week2.mission2.p3;

public class Fruit {
    private String fruitName;
    private int count;

    public Fruit(String fruitName, int count){
        this.fruitName = fruitName;
        this.count = count;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
