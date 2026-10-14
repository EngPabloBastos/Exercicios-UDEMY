package Alturas;

import Aprovacao.Alunos;

import java.util.Scanner;

public class Mainnn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double menorAltura = 100;
        double maiorAltura = 0;
        double somaMulheres = 0;
        int numHomem = 0;
        int numMulher = 0;

        int n;

        System.out.print("Quantos alnos serão digitados: ");
        n = sc.nextInt();

        Pessoas[] vetor = new Pessoas[n];

        for (int i =0;i< vetor.length;i++){
            System.out.print("Digite a altura da "+(i+1)+"ª pessoa: ");
            double altura = sc.nextDouble();
            if (altura < menorAltura){
                menorAltura = altura;
            }
            if (altura> maiorAltura){
                maiorAltura = altura;
            }

            System.out.print("Digite o gênero da "+(i+1)+"ª pessoa: ");
            char genero = sc.next().charAt(0);

            vetor[i] = new Pessoas(genero, altura);

            if (genero == 'F'){
                somaMulheres += altura;
            }
        }

        for (int i = 0; i< vetor.length; i++){
            if (vetor[i].getGenero() == 'M'){
                numHomem ++;
            }
            else{
                numMulher++;
            }
        }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média alturas mulheres: "+ String.format("%.2f%n",(somaMulheres)/numMulher));
        System.out.println("Número de homens: "+ numHomem);





        sc.close();
    }
}
