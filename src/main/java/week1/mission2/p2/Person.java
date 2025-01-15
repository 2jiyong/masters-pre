package week1.mission2.p2;

public class Person {
    private String name;
    private int age;
    private String gender;
    private Boolean isMarried;
    private int numberOfChilderen;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public String getIsMarried(){
        if (!this.isMarried){
            return "미혼";
        }
        return "기혼자";
    }

    public void showPersonInfo(){
        System.out.println("이름은 "+this.name+"이고 나이는 "+this.age+"살 입니다. 성별은 "+this.gender+"이며, "+this.getIsMarried()+" 입니다. 자녀는 "+this.numberOfChilderen+"명이 있습니다.");
    }

    public static void main(String[] args) {
        Person jane = new Person("Jane");
        jane.age=30;
        jane.gender="여성";
        jane.isMarried=true;
        jane.numberOfChilderen=1;
        jane.showPersonInfo();
    }
}
