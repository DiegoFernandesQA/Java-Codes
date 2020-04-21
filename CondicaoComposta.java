/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaocomposta;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class CondicaoComposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento");
        int ano = entrada.nextInt();
        int i = 2020 - ano;
        System.out.println("Sua idade é " + i);
        System.out.println("Nasceu em " + ano);
        if (i >= 20){
            System.out.println("Maior de idade");        
        }
        else { 
            System.out.println("Menor de idade");
        }
    }
    
}
