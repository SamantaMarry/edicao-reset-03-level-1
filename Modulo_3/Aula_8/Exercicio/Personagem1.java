package Exercicio;

public class Personagem1 {

    public static void main(String[] args){
        Personagem Mario = new Personagem("Mario", 40, 1.50);
        Personagem Luigi = new Personagem("Luigi", 40, 1.60);

        Jogo jogo = new Jogo(Mario, Luigi);
        jogo.jogar();

        
    

    }
    
}
