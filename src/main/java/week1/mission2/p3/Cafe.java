package week1.mission2.p3;

public class Cafe {
    private String cafeName;
    private String menuName;
    private int menuPrice;
    public int income;

    public Cafe(String cafeName, String menuName, int menuPrice){
        this.cafeName = cafeName;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.income = 0;
    }

    public String getCafeName() {
        return cafeName;
    }

    public int getmenuPrice() {
        return menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }
}
