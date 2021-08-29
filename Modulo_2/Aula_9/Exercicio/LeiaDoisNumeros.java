package Exercicio;

import java.util.Scanner;

public class LeiaDoisNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int primeiroNumero = scan.nextInt();


        boolean segundoValorMaiorQuePrimeiro = false;
        int segundoNumero = 0;

        do{
            System.out.println("Entre com o segundo numero: ");
            segundoNumero = scan.nextInt();
            if( segundoNumero > primeiroNumero){
                segundoValorMaiorQuePrimeiro = true;


            }else{

                System.out.println(" O segundo numero deve ser maior que o primeiro.");
                
            }


        }while (!segundoValorMaiorQuePrimeiro);
        for ( int i = primeiroNumero; i <= segundoNumero; i++){

                System.out.println(i);
        }


    }
}
    
