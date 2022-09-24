package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean isContinuing = true ;
        while (isContinuing) {
            System.out.println("---Menu---");
            printMenu();
            int optionNumber = scanner.nextInt();
            switch (optionNumber){
                case 1 :
                    addNumbertoList(myList);
                    break;
                case 2 :
                    printList(myList);
                    break;
                case 3 :
                    getMaximumNumber(myList);
                    break;
                case 4 :
                    getMinimumNumber(myList);
                    break;
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                    System.out.println("You need to choose from 1 to 4 ");
                    System.out.println("Exit---");
                    isContinuing = false;
                    break;

            }

        }
    }
    public static void printMenu(){
        System.out.println("This is list menu :");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number ");
        System.out.println("Please choose option!");
    }

    public static void addNumbertoList(List<Integer> myList){
        System.out.println("How many number that you want add to List ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Please input value");
        for (int i = 0; i < length; i++) {
            myList.add(i, scanner.nextInt());
        }

    }
    public static void printList(List<Integer> myList){
        System.out.println("This is your List");
        System.out.println(myList);
    }

    public static void getMaximumNumber(List<Integer> myList){
        if(myList.isEmpty())
        {
            addNumbertoList(myList);
        }
        int maximumNumber = myList.get(0);
        for (int value : myList){
            if(maximumNumber < value){
                maximumNumber = value;
            }
        }

        System.out.printf("This is current Maximum Number %d\n",maximumNumber);

    }
    public static void getMinimumNumber(List<Integer> myList){
        if(myList.isEmpty())
        {
            addNumbertoList(myList);
        }
        int mininumNumber = myList.get(0);
        for (int value : myList){
            if(mininumNumber > value){
                mininumNumber = value;
            }
        }
        System.out.printf("This is current Mininum Number %d\n",mininumNumber);
    }


}
