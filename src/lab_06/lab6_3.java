package lab_06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lab6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] charArr = myStr.toCharArray();
        String newMyStr = "";
        System.out.println(Arrays.toString(charArr));
        for (char value :charArr) {
            if (Character.isDigit(value))
            {
                String digit = String.valueOf(value);
                newMyStr = newMyStr + digit;
            }
        }
        System.out.println(newMyStr);

    }
}
