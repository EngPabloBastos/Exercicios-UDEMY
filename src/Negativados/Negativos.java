package Negativados;

import java.util.Arrays;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        System.out.print("Quantos números vai digitar?: ");
        int n = sc.nextInt();

        double[] vect = new double[n];


        for (int i=0; i < vect.length;i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.println();

        double media = soma/ vect.length;

        System.out.println("Valores: " + Arrays.toString(vect));
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);




        sc.close();
    }
}
