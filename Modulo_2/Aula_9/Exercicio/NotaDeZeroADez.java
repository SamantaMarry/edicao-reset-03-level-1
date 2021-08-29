package Exercicio;

import java.util.Scanner;

public class NotaDeZeroADez {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma nota entre 0 e 10: ");
        
        
        boolean nota = false;
        do{
            double notaInformada = scan.nextDouble();
            if ( notaInformada <=10){
                nota = true;

                System.out.println("Nota informada foi: " + notaInformada);

            }else{

                System.out.println("Entre com uma nota válida!! ");
            }
        
 
        }while(!nota);

    }    

}        

    
    
    

