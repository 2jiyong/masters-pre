package week3.mission2.p2;

public class Student {
    private String name;
    private int studentId;
    private String major;
    private String requiredSubject;
    private int koreanGrade;
    private int mathGrade;

    public Student(String name, int studentId, String major, String requiredSubject, int koreanGrade, int mathGrade) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.requiredSubject = requiredSubject;
        this.koreanGrade = koreanGrade;
        this.mathGrade = mathGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRequiredSubject() {
        return requiredSubject;
    }

    public void setRequiredSubject(String requiredSubject) {
        this.requiredSubject = requiredSubject;
    }

    public int getKoreanGrade() {
        return koreanGrade;
    }

    public void setKoreanGrade(int koreanGrade) {
        this.koreanGrade = koreanGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }
}
