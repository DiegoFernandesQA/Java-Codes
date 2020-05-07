/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacaoide;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class VotacaoIde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int ano = entrada.nextInt();
        int voto = 2020 - ano;
        System.out.println("sua idade é " + voto);
        if (voto >= 18 && voto<70) { System.out.println("Voto Obrigatório");}
        if (voto >= 16 && voto< 18) { System.out.println("Opicional");}
        if (voto < 16){ System.out.println("Não pode votar");}
        
        
    }
    
}
