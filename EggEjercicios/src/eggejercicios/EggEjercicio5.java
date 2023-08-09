
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio5 {
    public static void main (String[] args){
    
    //Escribir un programa que lea un número entero por teclado y 
    //muestre por pantalla el doble, el triple y la raíz cuadrada 
    //de ese número. Nota: investigar la función Math.sqrt().
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para generar su doble, triple y raíz cuadrada.");
        
        double num1     = leer.nextDouble();
        double raiznum1 = Math.sqrt(num1);
        double doble    = num1 * 2;
        double triple   = num1 * 3;
        
        System.out.println("El doble de "+num1+" es: "+doble);
        System.out.println("El triple de "+num1+" es: "+triple);
        System.out.println("La raíz cuadrada de "+num1+" es: "+raiznum1);
    }
}
