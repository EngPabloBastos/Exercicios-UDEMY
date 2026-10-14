package Sistema_deNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("---Grades System---");
        System.out.println("Enter your grades");



        System.out.print("1st trimester: ");
        double nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 30){
            System.out.println("ERROR! The grade value must be between 0 and 30: ");
            System.out.printf("1st trimester: ");
            nota1 = sc.nextDouble();
        }

        System.out.print("2nd trimester: ");
        double nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 35){
            System.out.println("ERROR! The grade value must be between 0 and 35: ");
            System.out.printf("2nd trimester: ");
            nota2 = sc.nextDouble();
        }

        System.out.print("3rd trimester: ");
        double nota3 = sc.nextDouble();
        while (nota3 < 0 || nota3 > 35){
            System.out.println("ERROR! The grade value must be between 0 and 35: ");
            System.out.printf("3rd trimester: ");
            nota3 = sc.nextDouble();
        }
        System.out.println();
        System.out.println();

        student.calculoNota(nota1, nota2, nota3);
        System.out.println("---Final Status---");
        System.out.println();
        if (student.getPassou()){
            System.out.println("Passed!");
            System.out.println("Final Grade: "+ student.getNotaFinal());
        }
        else {
            System.out.println("Failed!");
            System.out.println("Final Grade: "+ student.getNotaFinal());
            System.out.println("Missing "+ student.getNotaFaltante() +" POINTS");
        }

        sc.close();
    }
}
