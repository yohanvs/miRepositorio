
package pooej12;

import java.util.Date;
import java.util.Scanner;

public class PooEj12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        String n1;
        int p1;
        int anio1;
        int mes1;
        int dia1;
        int edad2;
        
        Date fechaActual = new Date();
        
        System.out.println("Como se llama la primera persona?: ");
        n1 = leer.next();
        System.out.println("Ingrese la fecha de nacimiento de la primera persona");
        System.out.println("día: ");
        dia1 = leer.nextInt();
        System.out.println("mes: ");
        mes1 = leer.nextInt();
        System.out.println("Año: ");
        anio1 = leer.nextInt();
        
        Date fechaNacimiento1 = new Date(anio1-1900,mes1-1,dia1);       
        
        int edad = fechaActual.getYear() - fechaNacimiento1.getYear();
        
        System.out.println("La fecha de nacimiento de "+n1+" es "+edad);
                     
        
       /* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
          edad y retorna true en caso de que el receptor tenga menor edad que la persona que
          se recibe como parámetro, o false en caso contrario.*/
       
        System.out.println("Ingrese otra edad para compararla con la primera");
       boolean ed = false;
       edad2= leer.nextInt();
       
       
       if (edad < edad2) {
           ed = true;
           System.out.println("¿"+edad+ " es menor que "+ edad2 +"? "+ ed);                  
       }else{
           System.out.println("¿"+edad+ " es menor que "+ edad2 +"? "+ ed);
       }
       
    }
    
}
