package Exercicio;

import java.util.Scanner;

class LerCincoNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE; // O Integer.MIN_VALUE traz o menor inteiro suportado (-2147483648) e o Integer.MAX_VALUE traz o maior inteiro suportado (2177483647)

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número informado foi " + maior);
    }

}
    

