package week3.mission1.p1;

public class Member {
    protected String name;
    protected String membershipGrade;
    protected int bonusPoint;
    protected double bonusRatio;
    protected int parkingFeePerHour;
    protected int usedMoney;
    protected int parkedHour;

    public Member(String name, int usedMoney, int parkedHour){
        this.usedMoney = usedMoney;
        this.parkedHour = parkedHour;
    }

    public int calcPrice(int price){
        bonusPoint += (int) (price * bonusRatio);
        return price;
    }

    public void showShoppingInfo(){
        System.out.println(name+"님의 지불 금액은 "+ calcPrice(usedMoney) +" 원이고, 적립 포인트는 "+ bonusPoint+"점 입니다.");
        System.out.println("주차 요금은 "+ parkedHour*parkingFeePerHour+"원 입니다.");
    }
}
