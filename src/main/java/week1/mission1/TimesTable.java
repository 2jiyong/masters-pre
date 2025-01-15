package week1.mission1;

public class TimesTable {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 2; i<=num; i++){
            for (int j = 1; j<=num; j++){
                System.out.printf("%d"+" X "+ "%d = %d\n", i, j, i*j);
            }
        }
    }
}
