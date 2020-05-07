/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06.imc;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class Exercicio06IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        Scanner boo = new Scanner(System.in);
        Scanner foo = new Scanner(System.in);
        String a,sexo;
        float h, p =0, m = 72.7f, f= 62.1f;
        
        System.out.print("Qual é o seu nome? ");
        a = ent.nextLine();
        System.out.print("Qual é o seu sexo? [M/F] ");
        sexo = boo.nextLine();
        System.out.println("Qual é sua altura? ");
        h = foo.nextFloat();
                
        if (sexo.equals('M')){
            p = (m*h)- 58;
        }
        if (sexo.equals('F')){
            p = (f*h)- 44.7f;
        }
        System.out.println("Nome: " + a);
        if (sexo.equals('M')) {
        System.out.println("Sexo: Masculino");}
        if (sexo.equals('F')){
        System.out.println("Sexo: Feminino");
        }
        System.out.format("Seu peso ideal é: %.2f", (p));
        System.out.println(" ");
        System.out.println("Fim");
    }
    
}
