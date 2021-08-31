package Aula;


public class Arrays {
    
    public static void main(String[] args){

        double [] temperaturas = new double [365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]); // ver temperatura desse indice
        
        System.out.println("O tamanho do array " + temperaturas.length); // ver tamanho (quantidade de dados) eu posso colocar no array

        System.out.println("valores do array " + temperaturas); //não vai imprimir o tamanho do array, mas sim o endereço da memória que o array se localiza

        for ( int i=0; i<temperaturas.length; i++){ // length = tamanho do array

            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]); // versão padrão para imprimir ou iterar um array
        }


        for ( double temp : temperaturas){

            System.out.println(temp); // loop melhorado 
        }




    }
}