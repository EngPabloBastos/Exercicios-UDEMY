package Personas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String older = null;
        int olderAge = 0;

        System.out.print("Quantos pessoas você vai digitar?: ");
        int n = sc.nextInt();

        Pessoas2[] vetor = new Pessoas2[n];

        for (int i = 0; i< vetor.length;i++){
            sc.nextLine();
            System.out.println("Dados da "+ (i+1) + "ª pessoa:");
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();

            vetor[i] = new Pessoas2(nome, idade);

            if (idade > olderAge){
                olderAge = idade;
                older = nome;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + older);




    }
}
