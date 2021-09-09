package Aula;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    





    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if( l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("------------------------------------------");
            System.out.println("########## DESAFIANTE ##########");
            this.desafiante.apresentar();
            System.out.println("------------------------------------------");
            System.out.println("########## DESAFIADO ##########");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor){
                case 0: // Empate
                    System.out.println("------------------------------------------");
                    System.out.println("EMPATOU");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // desafiante vence
                    System.out.println("------------------------------------------");
                    System.out.println("VITÓRIA DO " + this.desafiado.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                case 2: // desafiado vence
                    System.out.println("------------------------------------------");
                    System.out.println("VITÓRIA DO " + this.desafiante.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();;
                    break;
            }


        }else{
            System.out.println("Luta não pode acontecer!");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
