
package pooej4;

import Entidad.Rectangulo;
import java.util.Scanner;

public class PooEj4 {
    public static void main(String[] args) {
       
     Rectangulo l = new Rectangulo(3,6);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido, empecemos a crear un rectàngulo!");
        
        System.out.println("Por favor ingrese el tamaño base:");
        l.setBase(leer.nextDouble());
        System.out.println("Por favor ingrese el tamaño de la alutra:");
        l.setAltura(leer.nextDouble());
        
        System.out.print("La superficie es: "+l.Superficie());
        System.out.println("El perimetro es: "+l.Perimetro());
        
        System.out.println("Si dibujamos el rectangùlo quedarìa asì: ");
        l.Dibujar();     
    }    
}
