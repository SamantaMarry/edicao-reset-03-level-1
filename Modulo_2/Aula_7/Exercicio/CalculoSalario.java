package Exercicio;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

    
        Scanner scan = new Scanner(System.in);

            System.out.println("Quanto você ganha por hora trabalhada? ");
            double valorDaHora  = scan.nextDouble();
            System.out.println("Quantas horas você trabalhou esse mês? ");
            double qtdDeHoras  = scan.nextDouble();
            System.out.println("Você receberá o valor de R$ " + valorDaHora * qtdDeHoras + " esse mês!!"); 

    }

    
}
