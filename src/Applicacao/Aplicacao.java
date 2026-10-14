package Applicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        double percentage;

        System.out.print("How many employees will be registered?: ");
        n = sc.nextInt();

        List<EmployeTest> employees = new ArrayList<>(n);


        for (int i = 0; i<n; i++){

            System.out.println("Employee #" + (i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new EmployeTest(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();


        System.out.print("Enter the percentage: ");
        percentage = sc.nextDouble();

        boolean encontrado = employees.stream().anyMatch(e ->e.getId() == id);


        if (encontrado){
            for(EmployeTest e: employees) {
                double newSalary = e.getSalary ()+ (e.getSalary() * percentage/100);
                if (e.getId() == id){
                    e.setSalary(newSalary);
                }
            }
        }
        else {
            System.out.println("ID NOT FOUND!");
        }

        System.out.println(employees);








        sc.close();
    }
}
