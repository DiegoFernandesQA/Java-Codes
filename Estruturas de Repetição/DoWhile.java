/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
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
