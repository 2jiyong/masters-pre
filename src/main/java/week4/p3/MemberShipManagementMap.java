package week4.p3;

import java.util.HashMap;

public class MemberShipManagementMap {
    private HashMap<Integer, Member> memberShipMap = new HashMap<>();

    public void addMemberShip(int memberId, String name, GRADE grade) {
        Member changedKey = memberShipMap.put(memberId, new Member(memberId, name, grade));
        if (changedKey != null) {
            System.out.println("이미 있는 아이디"+changedKey.getMemberId()+"의 값이 변경됩니다.");
        }

    }

    public void showAllMember(){
        System.out.println("=================================");
        for (Member member : memberShipMap.values()) {
            System.out.println(member.getName()+"님의 아이디는 "+member.getMemberId()+"이고 등급은 "+member.getMembershipGrade()+"입니다.");
        }
        System.out.println("=================================");
    }

    public boolean removeMember(int memberId) {
        if (memberShipMap.containsKey(memberId)) {
            memberShipMap.remove(memberId);
            return true;
        }
        System.out.println(memberId+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
