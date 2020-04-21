/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacorepfor;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class LacoRepFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float media;
        int cont, acum = 0, a;
        for (cont = 0; cont<10;){ 
            cont = ++cont;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escreva um o " + cont + "º :");
            a = entrada.nextInt();
            acum = acum + a;
            System.out.println("valor acumulado está em " + acum);
            
            
        } 
        media = acum/cont;
        System.out.println("A média dos números é: " + media);
    }
    
}
