package lab_02;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight! ");
        float weight = scanner.nextFloat();
        System.out.println("Next,please input your height! ");
        float height = scanner.nextFloat();
        float BMI = weight/(height*height);
        System.out.printf("Your BMI is %f\n", BMI);
        double minimumWeight = (18.5)*(height*height) ;
        double maximumWeight = (22.9)*(height*height);

        if (BMI >= 18.5 && BMI <= 22.9) {
            System.out.println("Your body is Normal weight, keep it");
        }
        else if (BMI < 18.5)
        {
            double minimumWeightIncrease = minimumWeight - weight ;
            double maximumWeightIncrease = maximumWeight - weight ;
            System.out.printf("Your should increase from %fkg to %fkg", minimumWeightIncrease, maximumWeightIncrease);
        }
        else
        {
            double maximumWeightDecrease = weight - minimumWeight;
            double minimumWeightDecrease = weight - maximumWeight;
            System.out.printf("Your should Decrease from %fkg to %fkg",minimumWeightDecrease, maximumWeightDecrease);
        }
    }
}
