package week2.mission2.p2;

import java.util.ArrayList;

public class Student {
    private static int serialNumber = 1000;

    private String name;
    private int studentId;
    private String major;
    private ArrayList<Subject> subjects = new ArrayList<Subject>();

    public Student(){
        this.studentId = ++serialNumber;
    }

    public Student(String name,String major){
        this();
        this.name = name;
        this.major = major;
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
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

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getTotalScore(){
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total;
    }

    public void showStudentInfo(){

         System.out.println(this.name+" 학생은 "+this.subjects.size()+"과목을 수강했습니다.");
         System.out.println("총점은 "+this.getTotalScore()+"점이고 평균은 "+this.getTotalScore()/this.subjects.size()+"점 입니다.");

    }
}
