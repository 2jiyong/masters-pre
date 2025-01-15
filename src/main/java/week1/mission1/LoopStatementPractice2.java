package week1.mission1;

import java.util.Scanner;

public class LoopStatementPractice2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nums = sc.next();
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        System.out.println(sum);
    }
}
