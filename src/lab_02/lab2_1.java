package lab_02;

import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight! ");
        float weight = scanner.nextFloat();
        System.out.println("Next,please input your height! ");
        float height = scanner.nextFloat();
        float BMI = weight/(height*height);
        System.out.printf("Your BMI is %f\n", BMI);
        if (BMI < 18.5) {
            System.out.println("Your body is Underweight");
        } else if (BMI >= 18.5 && BMI <= 22.9) {
            System.out.println("Your body is Normal weight");
        } else if (BMI >= 23 && BMI <= 29.9) {
            System.out.println("Your body is Overweight");
        } else {
            System.out.println("Your body is fat weight");
        }

    }
}
