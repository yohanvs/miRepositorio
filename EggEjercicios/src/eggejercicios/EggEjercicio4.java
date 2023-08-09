
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio4 {
   public static void main (String[] args){
   
   //Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
   //grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad en grados Celsius para poder mostrar dicha cantidad en grados Fahrenheit.");
   
        int c = leer.nextInt(); 
        int f = 32 + (9 * c / 5);
        
        System.out.println("Grados Celsius: "+c);
        System.out.println("Grados Fahrenheit: "+f);
        
   }    
}
