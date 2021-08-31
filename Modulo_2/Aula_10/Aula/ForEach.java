package Aula;

import java.util.Random;

public class ForEach {

    public static void main(String[] args){

        int[] notas = new int[10];

        Random random = new Random();

        for (int i=0; i<notas.length; i++){

            notas[i] = random.nextInt(10); // rodar numeroos aleatórios

        }

        for (int i=0; i<notas.length; i++){

            System.out.println(notas[i]);
        }


        System.out.println("Usando o for each"); // não funciona para leitura de teclado

        for (int nota : notas){
            System.out.println(nota);
        }



    }


    
}
