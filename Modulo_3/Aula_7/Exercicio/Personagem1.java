package Exercicio;

public class Personagem1 {

    public static void main(String[] args){
        Personagem p1 = new Personagem("Mario", 40, 1.50);
        Personagem p2 = new Personagem("Luigi", 40, 1.60);

        p1.caracteristicas();
        p2.caracteristicas();
        p1.saltar();
        p2.saltar();

    

    }
    
}
