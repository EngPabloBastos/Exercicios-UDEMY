package Inheritance;

import Inheritance.entities.ImportedProduct;
import Inheritance.entities.Product;
import Inheritance.entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.println("Product #" + (i+1) + " data: ");

            System.out.print("Commom, used or imported? (c/u/i): ");
            char Cui = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (Cui == 'i'){
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));

            } else if (Cui == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), UsedProduct.FMT);

                list.add(new UsedProduct(name, price, manufactureDate));
            }
            else{
                list.add(new Product(name, price));
            }
            System.out.println();
        }


        System.out.println("PRICE TAGS: ");
        for (Product p: list){
            System.out.println(p.priceTag());
        }





        sc.close();
    }
}
