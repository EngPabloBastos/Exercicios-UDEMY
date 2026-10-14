package ContaBancaria;

public class ContaCliente {
    private String name;
    private int numeroConta;
    private int saldo;
    public static final int taxaSaque = 5;


    //construtores
    public ContaCliente(int numeroConta, String name){
        this.name = name;
        this.numeroConta = numeroConta;
    }

    public ContaCliente(int numeroConta, String name, int saldo){
        this.name = name;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaldo() {
        return saldo;
    }


    public int getNumeroConta(){
        return numeroConta;
    }


    //Funções
    public void deposito(int valorDeposito){
        this.saldo += valorDeposito;
    }

    public void saque(int valorSaque){
        this.saldo -= valorSaque + taxaSaque;
    }

    //Info Conta
    public void exibirDados(){
        System.out.println();
        System.out.println("---Conta Bancária---");
        System.out.println("Cliente: "+ this.name);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: R$" + this.saldo);
    }
}
