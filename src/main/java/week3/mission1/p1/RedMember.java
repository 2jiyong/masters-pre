package week3.mission1.p1;

public class RedMember extends Member {
    public RedMember(String name, int usedMoney, int parkedHour) {
        super(name, usedMoney, parkedHour);
        this.name = name;
        this.membershipGrade = "RED";
        this.bonusRatio = 0.01;
        this.parkingFeePerHour = 3000;
    }
}
