package Impostos;

import Impostos.entities.Company;
import Impostos.entities.Individual;
import Impostos.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProgama {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.println("Tax Payer #"+ (i + 1) + " data");
            System.out.print("Individual or company? (i/c): ");
            char ic = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();

            if (ic == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name,anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numEmployee = sc.nextInt();

                list.add(new Company(name,anualIncome,numEmployee));
            }
            System.out.println();
        }

        double totalTaxes = 0;
        System.out.println("TAXES PAID:");
        for (TaxPayer t: list){
            System.out.println(t.taxesPaid());

           totalTaxes += t.taxPay();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));











        sc.close();
    }
}
