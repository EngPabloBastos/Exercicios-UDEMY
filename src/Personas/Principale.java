package Personas;

import java.util.Scanner;

public class Principale {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;



        System.out.print("Quantas pessoas serão digitadas?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoas[] vect = new Pessoas[n];

        //for do cadastro de dados
        for (int i = 0; i< vect.length; i++){
            System.out.println("Dados da "+ (i + 1) + "ª pessoa: " );
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            vect[i] =  new Pessoas(nome,idade,altura);
            sc.nextLine();
        }

        double soma = 0;

        //for da soma
        for (int i = 0; i< vect.length; i++){
            soma += vect[i].getAltura();
        }



        double media = soma/n;

        int m16 = 0;

        //for da idade
        for (int i = 0; i< vect.length; i++){
            if (vect[i].getIdade() <16){
                m16++;
            }
        }

        double porcentagem = ((double) m16/n) * 100;
        
        System.out.println("Altura média: "+ String.format("%.2f%n", media));
        System.out.println("Pessoas menores de 16: " + porcentagem + "%");
        for (int i = 0; i< vect.length; i++){
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }



        sc.close();

    }
}
