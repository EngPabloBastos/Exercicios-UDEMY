package ContaBancaria;

import java.util.Scanner;

public class Nubank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int saldoInicial;
        ContaCliente contaCliente;


        System.out.println("---Cadastro de Conta Nubank---");
        System.out.println();

        //numero
        System.out.printf("Digite o número desejado da conta: ");
        int numeroConta = sc.nextShort();

        //nome
        System.out.printf("Digite o nome do cliente: ");
        String nome = sc.next();
        sc.nextLine();

        //deposito inicial
        System.out.printf("Deseja fazer um depósito inicial? (s/n): ");
        String resposta = sc.nextLine();

        //"tratamento de erros"
        while (!resposta.equals("s") && !resposta.equals("n")){
            System.out.println("ERRO. Digite s ou n: ");
            resposta = sc.next();
        }


        //se houver saldo
        if (resposta.equals("s")) {
            System.out.printf("Digite o valor do saldo inicial: ");
            saldoInicial = sc.nextInt();
            contaCliente = new ContaCliente(numeroConta, nome, saldoInicial);
        }

        //sem saldo
        else {
            contaCliente = new ContaCliente(numeroConta, nome);
        }

        //dados da conta
        contaCliente.exibirDados();


        //deposito
        System.out.printf("Digite o valor do depósito: ");
        int deposito = sc.nextInt();
        contaCliente.deposito(deposito);

        //Dados de conta atualizados
        System.out.println("Dados da conta atualizados");
        contaCliente.exibirDados();

        //saque
        System.out.printf("Digite o valor do saque: ");
        int saque = sc.nextInt();
        contaCliente.saque(saque);

        //Dados de conta atualizados
        System.out.println("Dados da conta atualizados");
        contaCliente.exibirDados();



    }
}
