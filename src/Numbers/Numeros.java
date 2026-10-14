package Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar?: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i< vetor.length;i++){
            System.out.printf("Digite um número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        int qntPar = 0;
        System.out.println("Numeros pares: ");
        for (int i = 0; i< vetor.length;i++){
            if (vetor[i] % 2 == 0){
                qntPar++;
                System.out.printf(vetor[i] + " "    );
            }
        }
        System.out.println();
        System.out.println("Quantidade de pares: " + qntPar);




        sc.close();
    }
}
