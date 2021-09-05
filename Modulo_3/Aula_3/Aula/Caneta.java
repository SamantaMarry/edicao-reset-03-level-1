package Aula;

    public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        protected boolean tampada;

        public void status(){
            System.out.println("Qual modelo da caneta? " + this.modelo); //this = auto referência. Quem chamou o método status vai ser substituido por "this"
            System.out.println("Uma caneta " + this.cor); 
            System.out.println("Está tampada? " + this.tampada);
            System.out.println("Qual tamanho da ponta? " + this.ponta);
            System.out.println("Quanto tem de carga? " + this.carga);
            
        }

        public void rabiscar(){ //void = sem retorno

            if (this.tampada == true) {
                System.out.println("ERRO! Caneta tampada");
            } else{
                System.out.println("Rabiscando...");
            }

        }

        protected void tampar(){
            this.tampada = true;


        }

        protected void destampar(){
            this.tampada = false;

    }    
    
}
