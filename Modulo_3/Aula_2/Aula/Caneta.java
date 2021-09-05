package Aula;

    public class Caneta {
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;

        void status(){
            System.out.println("Qual modelo da caneta? " + this.modelo); //this = auto referência. Quem chamou o método status vai ser substituido por "this"
            System.out.println("Uma caneta " + this.cor); 
            System.out.println("Está tampada? " + this.tampada);
            System.out.println("Qual tamanho da ponta? " + this.ponta);
            System.out.println("Quanto tem de carga? " + this.carga);
            
        }

        void rabiscar(){ //void = sem retorno

            if (this.tampada == true) {
                System.out.println("ERRO! Caneta tampada");
            } else{
                System.out.println("Rabiscando...");
            }

        }

        void tampar(){
            this.tampada = true;


        }

        void destampar(){
            this.tampada = false;

    }    
    
}