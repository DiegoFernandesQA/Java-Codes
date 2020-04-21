package lacorepwhile;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class LacoRepWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a,cond = "s";
        int media, cont = 0, num, acum=0;
        Scanner entrada = new Scanner(System.in);
        Scanner tab = new Scanner(System.in);
        while (cont<10) { 
            cont++;
            
            System.out.println("Escreva o nº" + cont + ": ");
            num = entrada.nextInt();
            acum = acum + num;
            
            System.out.println("Quer continuar? [s/n] ");
            a = tab.nextLine();     
            if (a.equals(cond)) {
            continue;
            } else{break;}        
        }
        media = acum/cont;
        System.out.println("A media é de: " + media);
        System.out.println("O acumulado é " + acum);
        System.out.println("A contagem é " + cont);
        
        }
                   
                              
        
            } 
            
            
        
         
        
    }
        
                     
                        
    
    

