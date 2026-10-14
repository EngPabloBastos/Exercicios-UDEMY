package retângulo;

public class Retangulo {
    public double altura;
    public double largura;

    public double calculoArea(double altura, double largura){
        return altura * largura;
    }

    public double calculoPerimetro(double altura, double largura){
        return 2 * altura + 2 * largura;
    }

    public double calculoDiagonal(double altura, double largura){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }

}
