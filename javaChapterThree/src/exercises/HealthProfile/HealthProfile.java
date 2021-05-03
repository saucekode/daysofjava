package exercises.HealthProfile;
import exercises.BMI;
import exercises.Date.Date;
import exercises.HeartRates.HeartRates;
import java.util.Scanner;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;

    public HealthProfile(String firstName, String lastName, String gender, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        if(gender == "male" || gender == "female"){
            this.gender = gender;
        }
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date(10,5,1990);
        BMI bmi = new BMI();
        HeartRates user = new HeartRates(null, null, date.toString());
        HealthProfile profile = new HealthProfile(user.getFirstName(), user.getLastName(), null, date.toString());

        System.out.println(profile.toString());

        System.out.println("Enter first name");
        user.setFirstName(input.nextLine());

        System.out.println("Enter last name");
        user.setLastName(input.nextLine());

        System.out.println("Enter gender");
        profile.setGender(input.nextLine());

        System.out.println("Enter weight");
        bmi.setWeightInKilogrammes(input.nextDouble());
        double weight = bmi.getWeightInKilogrammes();

        System.out.println("Enter height");
        bmi.setHeightInMeters(input.nextDouble());
        double height = bmi.getHeightInMeters();

        System.out.println("Enter year of birth:");
        date.setYear(input.nextInt());

        System.out.println("Enter month of birth in numbers:");
        date.setMonth(input.nextInt());

        System.out.println("Enter day of birth:");
        date.setDay(input.nextInt());

        System.out.println("Enter current exercise level?\nExercise level should be between 50 - 85%");
        int exerciseLevel = input.nextInt();

        bmi.setBMI(weight,height);
        user.calculateAgeInYears(date.getYear());
        user.calculateMaximumHeartRate(user.getAge());
        user.setTargetHeartRate(exerciseLevel, user.getMaximumHeartRate());

        System.out.println("<< Health Records >>");
        System.out.printf("Full Name: %s %s%n", user.getFirstName(), user.getLastName());
        System.out.printf("Date of birth: %s%n", date.toString());
        System.out.printf("Age: %d%n", user.getAge());
        System.out.println("Weight: " + bmi.getWeightInKilogrammes() + "kg");
        System.out.println("Height: " + bmi.getHeightInMeters() + "m");
        System.out.printf("Body Mass Index(BMI): %.1f%n", bmi.getBMI());
        System.out.println("Body status: " + bmi.getBMIResultMessage());
        System.out.println("Maximum heart rate is: " + user.getMaximumHeartRate());
        System.out.println("Target heart rate is: " + user.getTargetHeartRate());
    }
}
