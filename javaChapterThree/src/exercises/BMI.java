package exercises;

import java.util.Scanner;

public class BMI {
    private double weightInKilogrammes;
    private double heightInMeters;
    private double BMICalculation;

    public double getWeightInKilogrammes() {
        return weightInKilogrammes;
    }

    public void setWeightInKilogrammes(double weightInKilogrammes) {
        this.weightInKilogrammes = weightInKilogrammes;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public void setBMI(double weight, double height){
        if(height >= 100){
            this.weightInKilogrammes = weight;
            this.heightInMeters = height/100;
            this.BMICalculation = weightInKilogrammes / (heightInMeters * heightInMeters);
        }else{
            System.out.println("Invalid height");
        }
    }

    public double getBMI(){
        return BMICalculation;
    }

    public String getBMIResultMessage(){
        String resultMessage = "";
        if(BMICalculation < 18.5){
            resultMessage = "Underweight";
        }else{
            if(BMICalculation <= 24.9){
                resultMessage = "Normal";
            }else{
                if(BMICalculation <= 29.9){
                    resultMessage = "Overweight";
                }else{
                    if(BMICalculation >= 30){
                        resultMessage = "Obese";
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
        userBmi.setWeightInKilogrammes(input.nextDouble());
        double weightInput = userBmi.getWeightInKilogrammes();

        System.out.println("Enter your height");
        userBmi.setHeightInMeters(input.nextDouble());
        double heightInput = userBmi.getHeightInMeters();

        userBmi.setBMI(weightInput, heightInput);

        System.out.printf("%.1f%n", userBmi.getBMI());
        System.out.println(userBmi.getBMIResultMessage());
    }
}
