package BrinksdeSoma;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos valores cada vetor terá: ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorS = new int[n];


        System.out.println("Valores do Vetor A: ");
        for (int i =0; i< vetorA.length; i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vetorA[i] = num;
        }

        System.out.println();

        System.out.println("Valores do vetor B: ");
        for (int i =0; i< vetorB.length; i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vetorB[i] = num;
        }

        for (int i =0; i< vetorS.length; i++){
            int soma = vetorA[i] + vetorB[i];
            vetorS[i] = soma;
        }

        System.out.println("Vetor Resultante: ");
        for (int i = 0; i<vetorS.length; i++){
            System.out.println(vetorS[i]);
        }

        sc.close();
    }
}
