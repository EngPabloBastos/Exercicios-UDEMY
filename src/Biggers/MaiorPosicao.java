package Biggers;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double maiorNum = 0;
        int posicaoMaiorNum = 0;
        System.out.print("Quantos números você vai digitar?: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i< vetor.length;i++){
            System.out.printf("Digite um número: ");
            double numero = sc.nextDouble();
            vetor[i] = numero;
        }

        for (int i = 0; i<vetor.length; i++){
            if (vetor[i] > maiorNum){
                maiorNum = vetor[i];
                posicaoMaiorNum = i;
            }
        }


        System.out.println("Maior valor: " + maiorNum);
        System.out.println("Posição maior valor: " + posicaoMaiorNum);

        sc.close();
    }
}
