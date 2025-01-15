package week2.mission2.p2;

public class Subject {
    private String subjectName;
    private int score;

    public Subject(String subjectName, int score){
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
