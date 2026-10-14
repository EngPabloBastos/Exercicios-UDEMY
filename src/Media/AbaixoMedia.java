package Media;

import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int qntPares = 0;

        System.out.print("Quantos elementos terá o vetor: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i< vetor.length;i++){
            System.out.printf("Digite um número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
            if (numero % 2 == 0){
                soma += numero;
                qntPares++;
            }
        }

        if (qntPares == 0){
            System.out.println("NENHUM NÚMERO PAR");
        }
        else{
            System.out.println("MEDIA DOS PARES: " + soma/qntPares);
        }


        sc.close();
    }
}
