/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author diego.fernandes
 */
public class ComparacaoString {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Diego";
        String nome2 = "Diego";
        String nome3 = new String ("Diego");
        //Operação ternária
        String res;
        res = (nome1 == nome3)? "igual":"diferente";
        String res2 = (nome1.equals(nome3))? "igual":"diferente";
        System.out.println(res);
        System.out.println(res2);
        
    }
    
}
