package Exercicio;
import java.util.Scanner;

public class Multiplicador {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        int [] primeiroVetor = new int[5];
        for(int i=0; i < primeiroVetor.length; i++){
            System.out.println("Informe o primeiro valor: " + (i+1));
            primeiroVetor[i] = scan.nextInt();

        }



        int [] segundoVetor = new int[primeiroVetor.length];
        for(int i=0; i < primeiroVetor.length; i++){
            segundoVetor[i] = primeiroVetor[i] * 2;

        }

        System.out.println("Primeiro vetor: ");
        for(int item : primeiroVetor){
            System.out.println(item);
        }

        System.out.println("Segundo vetor: ");
        for(int item : segundoVetor){
            System.out.println(item);
        }





    }
    
}
