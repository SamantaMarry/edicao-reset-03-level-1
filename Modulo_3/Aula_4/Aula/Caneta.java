package Aula;

public class Caneta{
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, double p) { // este é o metodo construtor =  é o metodo que tem o mesmo nome da classe
        this.setCor(c);
        this.setModelo(m);
        this.setPonta(p);
        this.setTampada(true);
        this.tampar();

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(Double p){
        this.ponta = p;

    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;

    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }


    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    

    public void status (){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("cor " + this.getCor());
        System.out.println("Tampada " + this.isTampada());
    }
}
