package Aula;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um dia da semana valido: (1-7)");

        int diaSemana = scan.nextInt();

        switch (diaSemana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia da semana válido");
        }

        switch (diaSemana){
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("É um dia útil"); break;
            case 7: 
            case 1: System.out.println("Final de semana"); break;
            default: System.out.println("Não é um dia da semana válido");
        }
    
    }

}

