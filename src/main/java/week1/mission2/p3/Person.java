package week1.mission2.p3;

public class Person {
    private String name;
    private int money;
    private Cafe visitedCafe;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void drinkCoffee(Cafe cafe){
        this.visitedCafe = cafe;
        this.money -= cafe.getmenuPrice();
        cafe.income += cafe.getmenuPrice();
    }

    public void showPersonInfo(){
        System.out.println(this.name+"님의 남은 돈은 "+this.money+"원 입니다. "+visitedCafe.getCafeName()+"에서 "+visitedCafe.getMenuName()+"를 마셨습니다.");
    }

}
