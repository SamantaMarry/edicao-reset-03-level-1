package Exercicio;

import java.util.Scanner;

public class GeradorTabuada {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número deseja ver a tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do: " + tabuada);

        for( int x = 0; x <= 10; x++){

            System.out.println(x + " x " + tabuada + " = " + x * tabuada);

        }
        
    }    

    
}
