package Aula;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
     
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Entre com a sua idade: ");
         
         int idade = scan.nextInt();
         if (idade >= 18){
            System.out.println("É maior de idade");
        } else{
            
            System.out.println("Ainda não é maior de idade,");

        }



    }

}

