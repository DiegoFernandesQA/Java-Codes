
package programapernas;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner en = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int pernas = en.nextInt();
        System.out.println("Isso é um(a) ");
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranhas";
                break;
            default:
                tipo = "ET";
                
        }
        System.out.println(tipo);
    }
    
}
