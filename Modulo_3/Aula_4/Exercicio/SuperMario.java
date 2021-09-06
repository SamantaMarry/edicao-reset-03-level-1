package Exercicio;

public class SuperMario {
    private String nome;
    private int idade;
    private Double altura;
    private int estamina;

    public SuperMario(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;

    }

    public SuperMario(String nome, int idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    


    public void caracteristicas (){
        System.out.println("Seu nome é " + nome + ". Tem " + idade +  " Anos. Possui " + altura + " de altura. Possui " + estamina + " de estamina!!");


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
