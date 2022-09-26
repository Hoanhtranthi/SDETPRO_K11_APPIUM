package lab_06;

import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int isContinuing = 0;
        while (isContinuing < 3){
            System.out.println("Please input your password!");
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.nextLine();
            if (!inputPassword.equals(myPassword))
            {
                System.out.println("Password is wrong, please input again");
                isContinuing++;
            } else
            {
                System.out.println("Correct!");
                break;
            }

        }
        if (isContinuing == 3) {
            System.out.println("Wrong password 3 times");
        }

    }
}
