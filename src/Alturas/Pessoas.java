package Alturas;

public class Pessoas {
    private double altura;
    private char genero;

    public Pessoas(char genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }
}
