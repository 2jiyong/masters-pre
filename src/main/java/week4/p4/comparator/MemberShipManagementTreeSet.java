package week4.p4.comparator;

import java.util.TreeSet;

public class MemberShipManagementTreeSet {
    private TreeSet<Member> memberShipTreeSet = new TreeSet<>(new MemberComparator());

    public void addMemberShip(int memberId, String name, GRADE grade) {
        Member member = new Member(memberId, name, grade);
        if (!(memberShipTreeSet.add(member))){
            System.out.println("이미 있는 아이디"+member.getMemberId()+"는 추가할 수 없습니다.");
        }
    }

    public void showAllMember(){
        System.out.println("=================================");
        for (Member member : memberShipTreeSet) {
            System.out.println(member.getName()+"님의 아이디는 "+member.getMemberId()+"이고 등급은 "+member.getMembershipGrade()+"입니다.");
        }
        System.out.println("=================================");
    }

    public boolean removeMember(int memberId) {
        for (Member member : memberShipTreeSet) {
            if (member.getMemberId() == memberId) {
                memberShipTreeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
