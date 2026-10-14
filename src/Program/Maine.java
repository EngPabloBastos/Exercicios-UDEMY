package Program;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Maine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered?: ");
        int n = sc.nextInt();

         for (int i=0; i<n; i++){
             System.out.println("Employee #" + (i+1) + ":");

             System.out.print("ID: ");
             Integer id = sc.nextInt();

             sc.nextLine();
             System.out.print("Name: ");
             String name = sc.nextLine();

             System.out.print("Salary: ");
             Double salary = sc.nextDouble();


             Employee emp = new Employee(id, name, salary);

             list.add(emp);
         }

        System.out.println("Enter the employee id that you want to increase: ");
         int idSalary = sc.nextInt();

         Integer pos = position(list, idSalary);
         if (pos == null){
             System.out.println("This ID does not exist!");
         }
         else {
             System.out.print("Enter ther percentage: ");
             double percent = sc.nextDouble();

             list.get(pos).increaseSalary(percent);
         }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp: list){
            System.out.println(emp);
        }


        sc.close();
    }


    static Integer position(List<Employee> list, int id){
        for (int i =0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
