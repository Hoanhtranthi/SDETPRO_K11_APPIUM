package lab_03;

import java.security.SecureRandom;

public class lab3_3 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int [] myIntArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            myIntArray[i] = new SecureRandom().nextInt(100);
            System.out.println("arr[" + i + "] = " + myIntArray[i]);
        }
        int temp = 0;
        for(int i = 0 ;i <arrayLength ; i ++ )
            for (int j = 0 ;j <arrayLength ; j ++ )
            {
                if(myIntArray[j] > myIntArray[i] )
                {
                    temp = myIntArray[j] ;
                    myIntArray[j] = myIntArray[i];
                    myIntArray[i] = temp;

                }
            }
        System.out.print("Mảng sắp xếp tăng dần là : ");
        for(int i = 0 ;i <arrayLength ; i ++ )
        {
            System.out.print(myIntArray[i] + ",");
        }

    }
}
