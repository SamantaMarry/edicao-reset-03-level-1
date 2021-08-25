package Aula;

import java.util.Scanner;

public class LeituraDadosTeclado{

    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in);


    /* System.out.println("Digite seu nome completo: ");
    String nomeCompleto = scan.nextLine();
    System.out.println("Seu nome Completo é: " + nomeCompleto);    
    

    System.out.println("Digite seu primeiro nome: ");
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é " + primeiroNome);    

    System.out.println("Digite a sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua Idade é: " + idade + " Anos");

    System.out.println("Digite a sua altura: ");
    Double altura = scan.nextDouble();
    System.out.println(" Sua altura é: " + altura + "Centimentros"); */



    System.out.println("Digite seu nome completo, idade, quatidade de filhos, altura e se tem animal de estimação. ");
    String nomeCompleto = scan.next();
    int idade = scan.nextInt();
    byte quatidadeFilhos = scan.nextByte();
    float altura = scan.nextFloat();
    boolean temPet = scan.nextBoolean();

    System.out.println(" Você digitou as seguintes informações: ");
    System.out.println("Seu nome completo é: " + nomeCompleto);
    System.out.println("Você tem " + idade + " Anos");
    System.out.println("Possui " + quatidadeFilhos + " filhos");
    System.out.println("Tem " + altura + " cm de altura");
    System.out.println("Possui animal e estimação? " + temPet);
    
    }


}