
package pedrp;
import java.util.Scanner;
public class Pedrp {
    
    public static final int POUCOS = 50;
    public static final int ALGUNS = 75;
    
    
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      int h, estadia;
      
        System.out.println("Insira o número de hospedes: ");
        h = leia.nextInt();
        if (h < 0){
            System.out.println("Número invalido!");
            System.out.println("Volte a inserir o numero de hospedes: ");
            h = leia.nextInt();
            System.out.println("\n");
        }
        
        System.out.println("Insira o tempo da estadia: ");
        estadia = leia.nextInt();
        if ( estadia < 1){
            System.out.println("Número invalido!");
            System.out.println("Volte a inserir o numero de dias: ");
            estadia = leia.nextInt();
            System.out.println("\n");
        }
        int x = 0;
        if ( h <= 2){
            x = (POUCOS * estadia);
            System.out.println("Irá receber: " + x ); 
        }
        else{
            if (h >2 && h<= 4){
                x = ALGUNS * estadia;
                System.out.println("Irá receber: " + x);
            }
            else{
                if (h >4 && h <= 6){
                    x = h * 15 * estadia;
                    System.out.println("Irá receber: " + x);
                }
                else
                    System.out.println("Número de hospedes excedido!!!");
            }
        }
        
      
      
    }
    
}
