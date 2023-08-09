
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio3 {
    public static void main (String[] args){
    
// Escribir un programa que pida una frase y la muestre toda en mayúsculas 
//y después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Hola, dame una frase para retornarla en MAYUSCULA!");
        String frase        = leer.nextLine();
        String fraseMayus   = frase.toUpperCase();
        System.out.println("Genial! tu frase es:" +fraseMayus);
      
    }
}
