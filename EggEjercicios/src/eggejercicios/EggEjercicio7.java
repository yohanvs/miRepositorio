
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio7 {
    public static void main(String[] args){
    
      //Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    //el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
    //Incorrecto. Nota: investigar la función equals() en Java.
        
        Scanner leer = new Scanner (System.in);
        
        String frase;
        String clave = "eureka";
        
        System.out.println("Escriba una frase o palabra para determinar si es igual a -eureka-");
        
        frase = leer.nextLine();
        
        boolean igual = frase.equals(clave);
        System.out.println("La palarba que indíco es: "+igual);
        
        
    }
}
