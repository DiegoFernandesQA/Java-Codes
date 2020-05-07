package operadoreslogicos;
/**
 *
 * @author diego.fernandes
 */
public class OperadoresLogicos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, ou, oux;
        r = (x<y && y<z)? true:false;
        ou = (x<y || y==z)? true:false;
        oux = (x<y ^ y==z)? true:false; 
        
        System.out.println(r);
        System.out.println(ou);
    }
    
}
