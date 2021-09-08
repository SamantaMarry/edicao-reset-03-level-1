package Exercicio;

public class SuperMario {
    private String nome;
    private int idade;
    private Double altura;
    private int estamina;
    private int qtdMoedas;
    private int qtdVidas;


    public SuperMario(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
        this.qtdMoedas = 0;
        this.qtdVidas = 1;

    }

    public SuperMario(String nome, int idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
    }



    public void caracteristicas (){
        System.out.println("Seu nome é " + nome + ". Tem " + idade +  " Anos. Possui " + altura + " de altura. Possui " + estamina + " de estamina!! Tem " + qtdVidas + " Vida. " + qtdMoedas + " Moedas");


    }
    
    public void superPoder(){
        System.out.println("Mario possui Super Força!!");


    }

    public void pegarCogumelosAltos (){
        if(this.altura <= 1.40) {
            System.out.println("Precisa crescer para pegar cogumelos altos!!");
        }else{
            System.out.println("Parabéns você está crescidinho!! Conseguiu os cogumelos altos XD");
        }
    }

    public void perderEstamina(){
        this.estamina = this.estamina - 10;
        if(this.estamina < 0){
            this.estamina = 0;
        }
        

    }

    public void ganharEstamina(){
        this.estamina = this.estamina + 5;
        if(this.estamina > 100){
            this.estamina = 100;
        }
    }

    public void crescer(){
        this.altura = this.altura * 2;
        
    }

    public void revigorar(){
        this.estamina = 100;
    }

    public void morrer(){
        this.estamina = 0;
        this.qtdVidas = this.qtdVidas - 1;
        if ( this.qtdVidas < 0){
            this.qtdVidas = 0;
        }else{
            revigorar();
        }

    }
    
    public void coletarMoedas(){
        this.qtdMoedas = qtdMoedas + 1;
        if(this.qtdMoedas % 10 == 0){
            this.qtdVidas = qtdVidas + 1;
        }


        
    }
    
   
}

