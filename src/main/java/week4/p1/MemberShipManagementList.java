package week4.p1;

import java.util.ArrayList;

public class MemberShipManagementList {
    private ArrayList<Member> memberShipList;

    public MemberShipManagementList() {
        memberShipList = new ArrayList<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        Member member = new Member(id, name, grade);
        memberShipList.add(member);
    }

    public void showAllMember() {
        System.out.println("===================================");
        for (Member member : memberShipList) {
            System.out.println(member.getName()+"님의 아이디는 "+member.getMemberId()+"이고 등급은 "+member.getMembershipGrade()+"입니다.");
        }
        System.out.println("===================================");
    }

    public boolean removeMember(int id){
        for (int i=0; i<memberShipList.size(); i++){
            if(memberShipList.get(i).getMemberId() == id){
                memberShipList.remove(i);
                return true;
            }
        }
        System.out.println(id+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
