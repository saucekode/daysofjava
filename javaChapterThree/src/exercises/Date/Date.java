package exercises.Date;

public class Date {
    private int month;
    private int day;
    private int year;
    private String monthToString;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <= 12){
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 31){
            return;
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String monthToString = "";
        monthToString = switch (getMonth()) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "invalid month";
        };

        return day + "-" + monthToString + "-" + year;
    }

    public static void main(String[] args) {
        Date date = new Date(0, 0, 0);
        date.setMonth(6);
        date.setDay(2);
        date.setYear(2020);
        System.out.println(date.toString());
    }
}
