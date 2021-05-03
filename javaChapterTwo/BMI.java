package ChapterTwo;

import java.util.Scanner;

public class BMI {
    private double weightInKilogrammes;
    private double heightInMeters;
    private double BMICalculation;

    public void setHeightAndWeight(double weight, double height){
        if(height < 100){
            System.out.println("Invalid height");
        }
        this.weightInKilogrammes = weight;
        this.heightInMeters = height/100;
        this.BMICalculation = weightInKilogrammes / (heightInMeters * heightInMeters);
    }

    public double getBMI(){
        return BMICalculation;
    }

    public String getBMIResultMessage(){
        String resultMessage = "";
        if(BMICalculation < 18.5){
            resultMessage = "You are underweight";
        }else{
            if(BMICalculation <= 24.9){
                resultMessage = "You are normal";
            }else{
                if(BMICalculation <= 29.9){
                    resultMessage = "You are overweight";
                }else{
                    if(BMICalculation >= 30){
                        resultMessage = "You are obese";
                    }
                }
            }
        }
        return resultMessage;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMI userBmi = new BMI();

        System.out.println("Enter your weight:");
        double weightInput = input.nextDouble();

        System.out.println("Enter your height");
        double heightInput = input.nextDouble();

        userBmi.setHeightAndWeight(weightInput, heightInput);

        System.out.printf("%.1f%n", userBmi.getBMI());
        System.out.println(userBmi.getBMIResultMessage());
    }
}
