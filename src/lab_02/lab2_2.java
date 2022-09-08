package lab_02;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1 number to check ");
        int number = scanner.nextInt();
        if(number%2 == 0)
        {
            System.out.println("This number is even number");
        }
        else
        {
            System.out.println("This number is odd number");
        }
    }
}
