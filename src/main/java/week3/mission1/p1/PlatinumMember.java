package week3.mission1.p1;

public class PlatinumMember extends Member {
    double discountRatio;

    public PlatinumMember(String name, int usedMoney, int parkedHour) {
        super(name, usedMoney, parkedHour);
        this.membershipGrade = "PLATINUM";
        this.bonusRatio = 0.05;
        this.discountRatio = 0.05;
        this.parkingFeePerHour = 1000;
    }

    public int calcPrice(int price){
        bonusPoint += (int) (price * bonusRatio);
        return price-(int)(price*discountRatio);
    }
}
