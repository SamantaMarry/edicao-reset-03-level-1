package Exercicio;

import java.util.Random;

public class Jogo {
    //Atributos
    private Personagem jogador1;
    private Personagem jogador2;

    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }



    public void jogar(){
        Random geradorAleatorio = new Random();
        int coletarMoedasJogador1 = geradorAleatorio.nextInt(30);
        for(int i = 0; i < coletarMoedasJogador1; i++){
            jogador1.coletarMoedas();
        }

        int coletarMoedasJogador2 = geradorAleatorio.nextInt(30);
        for(int i = 0; i < coletarMoedasJogador2; i++){
            jogador2.coletarMoedas();
        }


        System.out.println("Jogador 1 coletou " + coletarMoedasJogador1 + " Moedas");
        System.out.println(" Resultado jogador 1:  ");
        jogador1.caracteristicas();

        System.out.println("Jogador 2 coletou " + coletarMoedasJogador2 + " Moedas");
        System.out.println(" Resultado jogador 2:  ");
        jogador2.caracteristicas();





    }

    
    
}
