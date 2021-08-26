package Exercicio;

import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);

        System.out.println("Vamos somar 2 números?");
        System.out.println("Digite o primeiro valor: ");
        int entrada1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int entrada2 = scan.nextInt();
        System.out.println("O resultado é ? " + (entrada1+entrada2));
        

    }
}
