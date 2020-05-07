package dowhile;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class DoWhile {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int n, cont=0, acum=0, media;
        String resp;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        do {
            cont++;
            System.out.println("Digite um número: ");
            n = entrada.nextInt();
            acum = acum +n;
            media = acum/cont; //
            System.out.println("Quer continuar? [S/N] ");
            resp = entrada2.next();
        } while (resp.equals("s"));
        System.out.println("A média dos valores é " + media);
    }
    
}
