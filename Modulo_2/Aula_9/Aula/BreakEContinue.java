package Aula;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();


        System.out.println("Entre com o máximo");
        int max = scan.nextInt();


        for(int i=num; i<=max; i++){
            System.out.println(i);
            
            if( i % 7 ==0){
                System.out.println("Q valor de i é " + i);
                break;
            }

            }    

                // OU

            for(int i=num; i<=max; i++){
                if( i % 7 ==0){
                    continue;
                }   
                System.out.println("Q valor de i é " + i);
            }

    }

}
