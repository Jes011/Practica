
package NumeroCancelador;


/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class main {
    
    public static void main(String args[]){
        
        java.util.Scanner escaner = new java.util.Scanner(System.in);
        
        double a = escaner.nextDouble();
        
        char[] a2 = String.valueOf(a).toCharArray();
        
        for(int i = a2.length-1;i>0;i--){
            if(a2[i]!= '.' && a2[i]!='0'){
                a = Double.valueOf(String.valueOf(a).substring(0, i+1));
                break;
            }
        }
        
        
        
        System.out.println(a);
        
        
        
    }
}
