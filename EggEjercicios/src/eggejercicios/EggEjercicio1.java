
package eggejercicios;

import java.util.Scanner;


public class EggEjercicio1 {

    
    public static void main(String[] args) {
        
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        //El programa deberá después mostrar el resultado de la suma
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos valores tipo byte");
        
        byte num1 = leer.nextByte();
        byte num2 = leer.nextByte();
        byte suma = (byte) (num1 + num2) ;
        
        
        System.out.println("La suma de los valores ingresados "+num1+" y "+num2+" es " +suma);
        
    
    
    
    
    }
    
}
