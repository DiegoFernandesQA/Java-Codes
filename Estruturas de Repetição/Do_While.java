package numeros;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner ent = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = ent.nextInt();
            
            s += n; //
            System.out.println("Quer continuar? [S/N] ");
            resp = ent.next();
        } while (resp.equals("s"));
        System.out.println("A Soma de todos os valores é " + s);
        
    }
    
}
