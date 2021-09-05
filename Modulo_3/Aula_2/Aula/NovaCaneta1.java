package Aula;

public class NovaCaneta1 {

    public static void main(String[] args){ // metodo principal

        Caneta c1 = new Caneta(); // classe vai na frente 1º
        c1.cor = "Azul";
        c1.ponta = 0.5f; // float
        /*c1.tampada = false; (é uma referenca a atributo - sem parenteses) */
        c1.tampar(); // vai começar como tampada; c1 chamou tampar, quem chamou? C1; Sempre que quiser modificar um atributo dentro da classe deve utilizar a palavra this na frente da linha que receberá o atributo.
        c1.status(); // referencia a metodo - com parenteses
        c1.rabiscar();
        

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();

        


    }
    
}
