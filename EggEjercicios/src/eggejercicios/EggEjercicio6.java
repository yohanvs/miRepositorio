
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio6 {
    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para determinar si es par o no.");
        
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El valor "+num+" ingresado es par."); 
        }else{
            System.out.println("El valor "+num+" ingresado es impar");
        }
    }
}
