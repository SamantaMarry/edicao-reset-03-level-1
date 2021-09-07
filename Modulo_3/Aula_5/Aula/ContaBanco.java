package Aula;

public class ContaBanco{
    // Atributos
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status; 

    // métodos especiais 

    public ContaBanco (){
        this.setSaldo(0);
        this.setStatus(false);
    } 
    
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos personalizados 

    public void abrirConta(String tipo){
         this.setTipo(tipo);
         this.setStatus(true);
         if (tipo == "CC"){
             this.setSaldo(50);
         }else if (tipo == "CP"){
             this.setSaldo(150);    
         }else{
             System.out.println("Use 'CC' para conta corrente e 'CP' para conta poupança. Tente novamente.");
         }

         System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta negativa");   
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void depositar(double valor){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Conta fechada");

        }
    }

    public void sacar(double valor){
        if (isStatus()){
            if (this.saldo >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }

    }

    public void pagarMensalidade(){
         double valor = 0;
         if(this.getTipo() == "CC"){
             valor = 12;
         }else if (this.getTipo() == "CP"){
             valor = 20;
         }else{
            System.out.println("Use 'CC' para conta corrente e 'CP' para conta poupança. Tente novamente.");
         }
         if(this.isStatus()){
             if (this.getSaldo() > valor){
                 this.setSaldo(this.getSaldo() - valor);
                 System.out.println("Mensalidade cobrada da conta de " + this.getDono());
             }else
             System.out.println("saldo insuficiente na conta de " + this.getDono());
         }else{
            System.out.println("Impossivel pagar");
         }

    }



    public void estadoAtual(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());

    }

    
}