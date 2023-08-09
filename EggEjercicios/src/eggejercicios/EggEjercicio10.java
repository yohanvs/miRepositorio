
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio10 {
    public static void main(String[] args){
    
    //Escriba un programa en el cual se ingrese un valor limite positivo, 
    //y a continuación solicite números al usuario hasta que la suma de 
    //los números introducidos supere el limite inicial.
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el valor límite.");
            int valor = leer.nextInt();
            int suma = 0 ;
            int num      ;
            boolean t = true;
            
            do {
               System.out.println("Ingrese valores");
               num = leer.nextInt();
               suma+=num;
                    if (suma > valor){
                       t = false;
                    }
        } while (t);
        System.out.println("La suma superó el limite del valor " +suma);
    }   
}
