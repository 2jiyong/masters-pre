package week3.mission2.p2;

import java.util.ArrayList;

public class Report {
    MajorEvaluation majorEvaluation = new MajorEvaluation();
    BasicEvaluation basicEvaluation = new BasicEvaluation();

    public Report(){}

    public String makeKoreanReport(Student[] students) {
        StringBuffer sb = new StringBuffer();
        sb.append("국어 수강생 학점\n");
        sb.append("이름  |  학번  | 중점과목 |  점수\n");
        for (Student student: students){
            sb.append(student.getName());
            sb.append(" | ");
            sb.append(student.getStudentId());
            sb.append(" | ");
            sb.append(student.getRequiredSubject());
            sb.append(" | ");
            sb.append(student.getKoreanGrade()).append(":");
            if (student.getRequiredSubject().equals("국어")) {
                sb.append(majorEvaluation.getGrade(student.getKoreanGrade()));
            }
            else {
                sb.append(basicEvaluation.getGrade(student.getKoreanGrade()));
            }
            sb.append(" | \n");
        }
        return sb.toString();
    }
    public String makeMathReport(Student[] students) {
        StringBuffer sb = new StringBuffer();
        sb.append("수학 수강생 학점\n");
        sb.append("이름  |  학번  | 중점과목 |  점수\n");
        for (Student student: students){
            sb.append(student.getName());
            sb.append(" | ");
            sb.append(student.getStudentId());
            sb.append(" | ");
            sb.append(student.getRequiredSubject());
            sb.append(" | ");
            sb.append(student.getMathGrade()).append(":");
            if (student.getRequiredSubject().equals("수학")) {
                sb.append(majorEvaluation.getGrade(student.getMathGrade()));
            }
            else {
                sb.append(basicEvaluation.getGrade(student.getMathGrade()));
            }
            sb.append(" | \n");
        }
        return sb.toString();
    }

}
