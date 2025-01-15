package week1.mission2.p1;

public class CalcTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(10, 2);
        Calc calc = new Calc();

        System.out.println("더하기는 "+calc.add(numbers.getNumber1(),numbers.getNumber2()) + "입니다.");
        System.out.println("빼기는 "+calc.sub(numbers.getNumber1(),numbers.getNumber2()) + "입니다.");
        System.out.println("곱하기는 "+calc.mul(numbers.getNumber1(),numbers.getNumber2()) + "입니다.");
        System.out.println("나누기는 "+calc.div(numbers.getNumber1(),numbers.getNumber2()) + "입니다.");

    }
}
