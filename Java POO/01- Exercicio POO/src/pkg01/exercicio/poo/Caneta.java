package pkg01.exercicio.poo;

/**
 *
 * @author Diego Fernandes
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual é a carga atual: " + this.carga);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A ponta é " + this.ponta);
        
    }
    
    void tampar() {
        this.tampada = true;
        
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERROR! Não posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando! ");
        }
        
    }
}
