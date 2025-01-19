package week3.mission1.p1;

import java.util.ArrayList;

public class MemberTest {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();

        members.add(new RedMember("James",10000,2));
        members.add(new RedMember("Tomas",30000,2));
        members.add(new PlatinumMember("Edward",10000,2));
        members.add(new PlatinumMember("Percy",30000,2));
        members.add(new DiamondMember("Elizabet",30000,2,1111));

        for (Member member : members) {
            member.showShoppingInfo();
        }
    }
}
