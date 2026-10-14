package VectorTest;

import java.util.Locale;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantity of products: ");
        int qntp = sc.nextInt();

        Productss[] vect = new Productss[qntp];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Productss(name, price);
        }

        double sum = 0;
        for (int i = 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/qntp;

        System.out.println("AVERAGE PRICE: "+ avg);

        sc.close();
    }
}
