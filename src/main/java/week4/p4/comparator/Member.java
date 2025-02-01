package week4.p4.comparator;

public class Member{
    protected String name;
    protected GRADE membershipGrade;
    protected int memberId;

    public Member(int memberId, String name, GRADE membershipGrade) {
        this.name = name;
        this.memberId = memberId;
        this.membershipGrade = membershipGrade;
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
