package exercises.HeartRates;
import exercises.Date.Date;
import java.util.Calendar;
import java.util.Scanner;

public class HeartRates {
    private int age;
    private int maximumHeartRate;
    private int targetHeartRate;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRates(String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void calculateAgeInYears(int year) {
        int age = Calendar.getInstance().get(Calendar.YEAR) - year;
        if(age > 0){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void calculateMaximumHeartRate(int age) {
        int maxHeartRate = 220 - age;
        this.maximumHeartRate = maxHeartRate;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void setTargetHeartRate(int exerciseLevel, int maximumHeartRate) {
        int targetHeartRate = (exerciseLevel * maximumHeartRate)/100;
        this.targetHeartRate = targetHeartRate;
    }

    public int getTargetHeartRate() {
        return targetHeartRate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date(0,0,2010);
        HeartRates user = new HeartRates("Jane", "Doe", date.toString());

        System.out.println("Enter your first name:");
        user.setFirstName(input.next());

        System.out.println("Enter your last name:");
        user.setLastName(input.next());

        System.out.println("Enter year of birth:");
        date.setYear(input.nextInt());

        System.out.println("Enter month of birth in numbers:");
        date.setMonth(input.nextInt());

        System.out.println("Enter day of birth:");
        date.setDay(input.nextInt());

        System.out.println("Enter current exercise level?\nExercise level should be between 50 - 85%");
        int exerciseLevel = input.nextInt();

        user.calculateAgeInYears(date.getYear());
        user.calculateMaximumHeartRate(user.getAge());
        user.setTargetHeartRate(exerciseLevel, user.getMaximumHeartRate());

        System.out.println("<< User report >>");
        System.out.printf("Full Name: %s %s%n", user.getFirstName(), user.getLastName());
        System.out.printf("Date of birth: %s%n", date.toString());
        System.out.printf("Age: %d%n", user.getAge());
        System.out.println("Maximum heart rate is: " + user.getMaximumHeartRate());
        System.out.println("Target heart rate is: " + user.getTargetHeartRate());
    }
}