package lab_03;

import java.security.SecureRandom;

public class lab3_2 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int [] myIntArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            myIntArray[i] = new SecureRandom().nextInt(100);
            System.out.println("arr[" + i + "] = " + myIntArray[i]);
        }
        int maximumNumber = myIntArray[0] ;
        int minimumNumber = myIntArray[0] ;
        for (int value :myIntArray)
            if(maximumNumber < value)
            {
                maximumNumber = value;
            }
        for (int value :myIntArray)
            if(minimumNumber > value)
            {
                minimumNumber = value ;
            }

        System.out.printf("Total Maximum number is %d\n",maximumNumber);
        System.out.printf("Total Minimum number is %d",minimumNumber);
    }
}

