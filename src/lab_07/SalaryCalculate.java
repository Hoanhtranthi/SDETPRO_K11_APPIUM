package lab_07;

import java.util.Scanner;

public class SalaryCalculate {
    public static void main(String[] args) {
        FTE fte = new FTE();
        Contractor contractor = new Contractor();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please input total full time employee");
        int totalFte = scanner.nextInt();
        System.out.println(" Please input total contract employee");
        int totalContractor = scanner.nextInt();
        int totalSalary = (totalFte*fte.salary()) + (totalContractor*contractor.salary());
        System.out.printf("Total salary is %d", totalSalary);
    }
}
