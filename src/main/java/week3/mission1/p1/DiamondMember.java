package week3.mission1.p1;

public class DiamondMember extends Member {
    double discountRatio;
    int agentId;

    public DiamondMember(String name, int usedMoney, int parkedHour, int agentId) {
        super(name, usedMoney, parkedHour);
        this.name = name;
        this.membershipGrade = "DIAMOND";
        this.bonusRatio = 0.1;
        this.discountRatio = 0.1;
        this.parkingFeePerHour = 0;
        this.agentId = agentId;
    }

    public int calcPrice(int price){
        bonusPoint += (int) (price * bonusRatio);
        return price-(int)(price*discountRatio);
    }

}
