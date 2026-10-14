package mercado_deTrabalho;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do colaborador: ");
        System.out.println();

        //nome
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        funcionario.setNome(nome);

        //CPF
        System.out.print("CPF: ");
        String cpf = sc.next();
        funcionario.setCPF(cpf);
        String cpfFormatado = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);

        //Salario Bruto
        System.out.print("Salário Bruto: ");
        double salarioBruto = sc.nextDouble();
        while (salarioBruto <= 0){
            System.out.println("Salário não pode ser menor ou igual a zero");
            System.out.print("Salário Bruto");
            salarioBruto = sc.nextDouble();
        }
        funcionario.setSalarioBruto(salarioBruto);

        //Imposto
        System.out.print("Digite o valor do imposto: ");
        double imposto = sc.nextDouble();
        while (imposto <= 0){
            System.out.println("Imposto não pode ser menor ou igual a zero!");
            System.out.print("Digite o valor do imposto: ");
            imposto = sc.nextDouble();
        }
        funcionario.setImposto(imposto);

        //Salario Liquido
        funcionario.setSalarioLiquido(salarioBruto, imposto);

        //Exibição de dados iniciais
        System.out.println("----INFORMAÇÕES----");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("CPF: " + cpfFormatado);
        System.out.println("Salário Bruto: R$" + String.format("%.2f", funcionario.getSalarioBruto()));
        System.out.println("Imposto: R$" + String.format("%.2f",funcionario.getImposto()));
        System.out.println();
        System.out.print("Salário Líquido: R$" + String.format("%.2f", funcionario.getSalarioLiquido()));
        System.out.println();


        //Calculo de aumento
        System.out.print("Quantos % de aumento dar ao coloborador?: ");
        double aumento = sc.nextDouble();
        funcionario.setAumentoValor(aumento);
        funcionario.setSalarioFinal(funcionario.getSalarioLiquido(), funcionario.getAumentoValor());


        //Exibição atualizada
        System.out.println("---INFORMAÇÕES ATUALIZADAS---");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("CPF: " + cpfFormatado);
        System.out.println("Salário Bruto: R$" + String.format("%.2f", funcionario.getSalarioBruto()));
        System.out.println("Imposto: R$" + String.format("%.2f",funcionario.getImposto()));
        System.out.println("Aumento: "+ aumento + "%");
        System.out.println();
        System.out.print("Salário FINAL: R$" + String.format("%.2f", funcionario.getSalarioFinal()));

        sc.close();
    }
}
