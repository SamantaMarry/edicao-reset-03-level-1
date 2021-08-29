package Exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {

    
        Scanner scan = new Scanner(System.in);
    
            System.out.println("Vamos descobrir qual foi sua média do semestre?");
            System.out.println("Digite a primeira nota: ");
            double nota1 = scan.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double nota2 = scan.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double nota3 = scan.nextDouble();
            System.out.println("Digite a quarta nota: ");
            double nota4 = scan.nextDouble();

            double resultado = (nota1+nota2+nota3+nota4)/4;

            DecimalFormat formato = new DecimalFormat("#.##");

            if (resultado == 10){
                System.out.println("Sua média foi "+ formato.format(resultado) + ". Aluno aprovado com louvores!");
            }else if (resultado >= 7){
                System.out.println("Sua média foi "+ formato.format(resultado) + ". Aluno aprovado!!");
            }else {
                System.out.println("Sua média foi "+ formato.format(resultado) + ". Aluno reprovado!!");
            }

   
    
    }
}