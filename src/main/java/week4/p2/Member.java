package week4.p2;

import week4.p2.GRADE;

import java.util.Objects;

public class Member {
    protected String name;
    protected GRADE membershipGrade;
    protected int memberId;

    public Member(int memberId, String name, GRADE membershipGrade) {
        this.name = name;
        this.memberId = memberId;
        this.membershipGrade = membershipGrade;
    }

    @Override
    public int hashCode(){
        return Objects.hash(memberId);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Member member)) return false;
        return memberId == member.getMemberId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GRADE getMembershipGrade() {
        return membershipGrade;
    }

    public void setMembershipGrade(GRADE membershipGrade) {
        this.membershipGrade = membershipGrade;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
