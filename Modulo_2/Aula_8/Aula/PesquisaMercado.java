package Aula;

import java.util.Scanner;

public class PesquisaMercado {
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual valor do produto? ");
        double valorProduto = scan.nextDouble();

        if (valorProduto <= 10){
            System.out.println("Pode comprar, está barato!");
        } else if (valorProduto > 10 && valorProduto < 15) {
            System.out.println("Precisa pedir um desconto? ");
        }else if (valorProduto >= 15 && valorProduto <17){
            System.out.println("Pode pesquisar um pouco mais ");
        }else{
            System.out.println("Muitoo caro!!");
        }
    }
}