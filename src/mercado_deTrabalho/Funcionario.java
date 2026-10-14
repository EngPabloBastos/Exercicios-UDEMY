package mercado_deTrabalho;

public class Funcionario {
    private String nome;
    private String CPF;
    private double salarioBruto;
    private double imposto;
    private double aumento;
    private double aumentoValor;
    private double salarioLiquido;
    private double salarioFinal;

    // Setters das variáveis privadas
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public void setAumento(double aumento){
        this.aumento = aumento;
    }

    public void setAumentoValor(double aumento){
        this.aumentoValor = salarioBruto * (aumento/100);
    }

    public void setSalarioLiquido(double salarioBruto, double imposto){
        this.salarioLiquido = salarioBruto - imposto;
    }

    public void setSalarioFinal(double salarioLiquido, double aumentoValor){
        this.salarioFinal = salarioLiquido + aumentoValor;
    }


    //Getter das variáveis privadas

    public String getNome(){
        return nome;
    }

    public String getCPF(){
        return CPF;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }

    public double getImposto(){
        return imposto;
    }

    public double getAumento(){
        return aumento;
    }

    public double getAumentoValor(){return aumentoValor;}

    public double getSalarioLiquido(){
        return salarioLiquido;
    }

    public double getSalarioFinal(){return salarioFinal;}

}
