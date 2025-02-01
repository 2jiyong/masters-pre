package week4.p4.comparator;

import java.util.Comparator;

public class MemberComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        return Comparator.comparing(Member::getMemberId)
                .thenComparing(Member::getName)
                .compare(o1, o2);
    }

}
