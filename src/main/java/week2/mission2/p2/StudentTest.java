package week2.mission2.p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student("Kim","국어");
        studentKim.addSubject(new Subject("국어", 100));
        studentKim.addSubject(new Subject("수학", 100));

        Student studentLee = new Student("Lee","국어");
        studentLee.addSubject(new Subject("국어",55));
        studentLee.addSubject(new Subject("수학",55));
        studentLee.addSubject(new Subject("영어",100));

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();

        String filePath = "C:\\Users\\user\\Desktop\\JavaStudy\\src\\main\\java\\week2\\mission2\\p2\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] datas = line.split(",");  // 한 줄씩 읽기
                for(String data : datas){
                    System.out.println(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
