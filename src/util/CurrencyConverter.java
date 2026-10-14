package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double valorReais(double valorDolar, double compraDolar){
        return compraDolar * valorDolar + (compraDolar * IOF);
    }
}
