package week4.p2;

import java.util.HashSet;

public class MemberShipManagementSet {
    private HashSet<Member> members = new HashSet<>();

    public void addMemberShip(int memberId, String name, GRADE grade) {
        Member member = new Member(memberId, name, grade);
        if (!(members.add(member))){
            System.out.println("이미 있는 아이디"+member.getMemberId()+"는 추가할 수 없습니다.");
        }
    }

    public void showAllMember() {
        System.out.println("=================================");
        for (Member member : members) {
            System.out.println(member.getName()+"님의 아이디는 "+member.getMemberId()+"이고 등급은 "+member.getMembershipGrade()+"입니다.");
        }
        System.out.println("=================================");
    }

    public boolean removeMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                members.remove(member);
                return true;
            }
        }
        System.out.println(memberId+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
