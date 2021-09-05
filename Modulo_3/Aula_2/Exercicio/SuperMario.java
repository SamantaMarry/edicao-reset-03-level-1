package Exercicio;

public class SuperMario {
    String corDaPele;
    float altura;
    String corDosOlhos;
    String corDosCabelos;
    String corDaRoupa;
    boolean bone;
    boolean luvas;
    String corDosSapatos;



    void caracteristicas (){
        System.out.println("Mario tem a pele " + corDaPele + ". Possui " + altura + " de altura. Usa roupa na cor " + corDaRoupa+ ". Seus olhos são "  + corDosOlhos);


    }
    
    void superPoder(){
        System.out.println("Mario possui Super Força!!");


    }

    void pegarCogumelosAltos (){
        if(this.altura <= 1.40) {
            System.out.println("Precisa crescer para pegar cogumelos altos!!");
        }else{
            System.out.println("Parabéns você está crescidinho!! Conseguiu os cogumelos altos XD");
        }
    }

    





    
}
