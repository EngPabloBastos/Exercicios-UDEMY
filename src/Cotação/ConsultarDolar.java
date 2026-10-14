package Cotação;
import util.CurrencyConverter;

import java.util.Scanner;

public class ConsultarDolar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("----CONVERSOR DE DÓLAR----");
        System.out.println();

        System.out.printf("Digite o valor atual do dólar: ");
        double valorDolar = sc.nextDouble();
        while (valorDolar < 0){
            System.out.println("Valor do dolar não pode ser inferior a 0");
            System.out.printf("Digite o valor atual do dólar: ");
            valorDolar = sc.nextDouble();
        }

        System.out.printf("Digite o valor em dólar que você deseja: ");
        double compraDolar = sc.nextDouble();
        while (compraDolar < 0){
            System.out.println("Valor da compra não pode ser inferior a 0");
            System.out.printf("Digite o valor atual do dólar: ");
            compraDolar = sc.nextDouble();
        }
        System.out.println();

        System.out.println("O dólar atualmente vale: " + valorDolar);
        System.out.println("Você deseja comprar $" + compraDolar);
        System.out.println("Valor á pagar em reais: ");
        System.out.println("R$"+ CurrencyConverter.valorReais(valorDolar,compraDolar));

    }
}
