package week3.mission2.p2;

public class EvaluationTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student("강감찬", 211213, "국어국문학과", "국어", 95, 56),
                new Student("김유신", 212330, "컴퓨터공학과", "수학", 95, 98),
                new Student("신사임당", 201518, "국어국문학과", "국어", 100, 88),
                new Student("이순신", 202360, "국어국문학과", "국어", 89, 95),
                new Student("홍길동", 201290, "컴퓨터공학과", "수학", 83, 56),
        };

        Report report = new Report();
        System.out.println(report.makeKoreanReport(students));
        System.out.println(report.makeMathReport(students));

    }
}
