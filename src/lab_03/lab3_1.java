package lab_03;

import java.security.SecureRandom;

public class lab3_1 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int [] myIntArray = new int[arrayLength];
        int countOddNumber = 0;
        int countEvenNumber = 0;
        for (int i = 0; i < arrayLength; i++) {
            myIntArray[i] = new SecureRandom().nextInt(100);
            System.out.println("arr[" + i + "] = " + myIntArray[i]);
            if(myIntArray[i]%2 == 0)
            {
                countOddNumber++;
            }
            else
            {
                countEvenNumber++;
            }
        }
        System.out.printf("Total Odd number is %d\n",countOddNumber);
        System.out.printf("Total Even number is %d",countEvenNumber);


    }
}
