package LearnDatas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Datas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de nascimento (dd/MM/yyyy): ");
        String entrada = sc.nextLine();
        LocalDate nascimento = LocalDate.parse(entrada, formatter);


        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(nascimento, hoje);
        int idade = periodo.getYears();

        System.out.println(idade);




        sc.close();
    }
}
