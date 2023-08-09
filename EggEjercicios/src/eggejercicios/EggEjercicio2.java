

package eggejercicios;

import java.util.Scanner;


public class EggEjercicio2 {
    public static void main (String[] args){
    
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    
    Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor, ingrese su nombre.");
        
        String nombre = leer.nextLine(); 
        
        System.out.println("El nombre ingresado es "+nombre+".");
    }
}
