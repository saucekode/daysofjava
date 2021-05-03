package ChapterTwo;
import java.lang.Math;
import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current world population:");
        int currentWorldPopulation = input.nextInt();

        System.out.println("Enter current annual world population growth rate:");
        double currentWorldPopulationGrowthRate = input.nextDouble();

        final double PERCENTAGE_GROWTH_RATE = currentWorldPopulationGrowthRate/100;

        System.out.printf("World population in one year %.1f:%n", currentWorldPopulation * Math.pow((1 + PERCENTAGE_GROWTH_RATE), 1));
        System.out.printf("World population in two years %.1f:%n", currentWorldPopulation * Math.pow((1 + PERCENTAGE_GROWTH_RATE), 2));
        System.out.printf("World population in three years %.1f:%n", currentWorldPopulation * Math.pow((1 + PERCENTAGE_GROWTH_RATE), 3));
        System.out.printf("World population in four years %.1f:%n", currentWorldPopulation * Math.pow((1 + PERCENTAGE_GROWTH_RATE), 4));
        System.out.printf("World population in five years %.1f:%n", currentWorldPopulation * Math.pow((1 + PERCENTAGE_GROWTH_RATE), 5));
    }
}
