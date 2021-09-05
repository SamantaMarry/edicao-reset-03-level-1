package Exercicio;

public class SuperMario {
    public String corDaPele;
    public float altura;
    public String corDosOlhos;
    private String corDosCabelos;
    private String corDaRoupa;
    private boolean bone;
    private boolean luvas;
    protected String corDosSapatos;



    public void caracteristicas (){
        System.out.println("Mario tem a pele " + corDaPele + ". Possui " + altura + " de altura. Usa roupa na cor " + corDaRoupa+ ". Seus olhos são "  + corDosOlhos);


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
}