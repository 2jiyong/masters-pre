package week2.mission2.p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        ArrayList<String> subjectsList = new ArrayList<String>();

        String filePath = "src/main/java/week2/mission2/p2/input.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            // 첫 줄은 header
            String[] header = bufferedReader.readLine().split(",");
            for (int i = 3; i < header.length; i++) {
                subjectsList.add(header[i]);
            }
            // 학생 정보 읽기
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataLine = line.split(",");  // 한 줄씩 읽기
                Student newStudent = new Student(dataLine[0], dataLine[2]);
                for (int i = 3; i < dataLine.length; i++) {
                    if (!dataLine[i].equals("")){
                        newStudent.addSubject(new Subject(header[i], Integer.parseInt(dataLine[i])));
                    }
                }
                studentsList.add(newStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentsList.get(0).showStudentInfo();
        studentsList.get(1).showStudentInfo();
    }
}
