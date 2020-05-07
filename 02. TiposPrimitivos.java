package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author diego.fernandes
 */
public class TiposPrimitivos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno:");
        String nome = entrada.nextLine();
        System.out.println("Diegite a nota do aluno:");
        float nota = entrada.nextFloat();
        System.out.printf("A nota de %s é %.2f  \n", nome, nota);
    }
    
}
