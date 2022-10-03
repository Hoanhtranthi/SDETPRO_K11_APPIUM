package lab_08.lab8_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public int getSalary(List<Employee> employees){
        int totalSalary = 0;
        for (Employee employee: employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee fte = new FTE();
        Employee contractor = new Contractor();
        EmployeeController employeeController = new EmployeeController();
        System.out.println("Please input number FTE");
        int numberFte = scanner.nextInt();
        System.out.println("Please input number Contractor");
        int numberContractor = scanner.nextInt();

        List<Employee> employeesList = new ArrayList<>();
        for (int i = 0; i < numberFte; i++) {
            employeesList.add(fte);
        }
        for (int i = 0; i < numberContractor; i++) {
            employeesList.add(contractor);
        }
        int totalSalary = employeeController.getSalary(employeesList);


        System.out.println(totalSalary);

    }
}