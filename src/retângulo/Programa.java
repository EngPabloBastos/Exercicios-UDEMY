package retângulo;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args){

        Retangulo retangulo = new Retangulo();

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a largura(base) e a altura do retângulo: ");
        System.out.println();

        System.out.print("Altura (base): ");
        double altura = sc.nextDouble();

        System.out.print("Largura: ");
        double largura = sc.nextDouble();

        System.out.println("Area: "+ retangulo.calculoArea(altura, largura));
        System.out.println("Perimetro: "+ retangulo.calculoPerimetro(altura, largura));
        System.out.println("Diagonal: "+ retangulo.calculoDiagonal(altura, largura));


        sc.close();
    }

}
