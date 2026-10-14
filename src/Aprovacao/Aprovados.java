package Aprovacao;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos alnos serão digitados: ");
        n = sc.nextInt();

        Alunos[] vetor = new Alunos[n];

        for (int i = 0; i< vetor.length; i++){
            sc.nextLine();
            System.out.println("Digite os dados do "+(i+1)+"º aluno: ");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Primeira Nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Segunda nota: ");
            double nota2 = sc.nextDouble();

            vetor[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.print("ALUNOS APROVADOS: ");
        for (int i = 0; i< vetor.length; i++){
            double media =(vetor[i].getNota1() + vetor[i].getNota2())/2;

            if (media >= 6){
                System.out.println(vetor[i].getNome());
            }
        }









        sc.close();

    }
}
