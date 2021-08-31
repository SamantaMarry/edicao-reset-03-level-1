package Exercicio;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


    int [] valores = new int[10];
    for(int i=0; i < valores.length; i++){
        System.out.println("Informe a idade da pessoa de número: " + (i+1));
        valores[i] = scan.nextInt();
    }

    int maioresDeIdade = 0;
    for(int valor : valores){
        if (valor>=18){
            maioresDeIdade++;
        }
    }

    System.out.println ("Idades computadas: ");
    for(int valor : valores){
        System.out.println (valor);
    }

    System.out.println ("-----------------------");

    System.out.println ("Quantidade de pessoas maiores de idade: " + maioresDeIdade);


        

    }


}
