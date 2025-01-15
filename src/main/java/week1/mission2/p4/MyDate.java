package week1.mission2.p4;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isLeapYear;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        updateLeapYearStatus(year);
    }

    public void updateLeapYearStatus(int year){
        if (year%400==0){
            this.isLeapYear = true;
        }
        else if (year%100==0){
            this.isLeapYear = false;
        }
        else if (year%4==0){
            this.isLeapYear = true;
        }
        else {
            this.isLeapYear = false;
        }
    }

    public Boolean isYearValid(){
        return this.year>0;
    }

    public Boolean isMonthValid(){
        return this.month>0 && this.month<=12;
    }

    public int lastDayOfMonth(){
        switch (this.month){
            case 1,3,5,7,8,10,12:
                return 31;
            case 4,6,9,11:
                return 30;
            case 2:
                return this.isLeapYear?29:28;
            default:
                return 0;
        }
    }

    public Boolean isDayValid(){
        return this.day>0 && this.day<=lastDayOfMonth();
    }

    public String isValid(){
        if (isYearValid() && isMonthValid() && isDayValid()){
            return this.year+"년 "+this.month+"월 "+this.day+"일은 유효한 날짜입니다.";
        }
        return this.year+"년 "+this.month+"월 "+this.day+"일은 유효하지 않은 날짜입니다.";
    }
}
