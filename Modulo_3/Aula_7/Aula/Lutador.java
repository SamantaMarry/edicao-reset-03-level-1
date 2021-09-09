package Aula;

/**
 * Lutador
 */

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos Públicos


    public void apresentar(){
        System.out.println("Lutador " + this.nome);
        System.out.println("Origem " + this.nacionalidade);
        System.out.println("idade " + this.idade + " Anos");
        System.out.println("Altura " + this.altura + " metros de altura");
        System.out.println("Pesando " + this.peso + " Kg");
        System.out.println("Ganhou " + this.vitorias + " Lutas");
        System.out.println("Perdeu " + this.derrotas + " Lutas");
        System.out.println("Empatou " + this.empates + " Lutas");

    }

    public void status(){
        System.out.println("------------------------------------------------");
        System.out.println(this.nome);
        System.out.println("Está na categoria " + this.categoria);
        System.out.println(this.vitorias + " Vitórias");
        System.out.println(this.derrotas + " Derrotas");
        System.out.println(this.empates + " Empates");

    }

    public void ganharLuta(){
        this.vitorias = this.vitorias + 1;

    }

    public void perderLuta(){
        this.derrotas = this.derrotas + 1;

    }

    public void empatarLuta(){
        this.empates = this.empates + 1;

    }

    // Métodos especiais

    public Lutador(String nome,String nacionalidade,int idade, Double altura, Double peso, int vitorias, int derrotas, int empates ){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }



    
}