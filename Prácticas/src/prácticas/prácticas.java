
package prácticas;

import java.util.Scanner;

public class prácticas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Diseñar un sistema que calcule vacaciones donde el usuario ingrese el nombre, tiempo de antiguedad y clave de rol en su trabajo
        
        String nombre = "";
        int clave = 0, ant = 0;
        System.out.println("-----------------------------------");
        System.out.println("Bienvenida al systema vacacional.");
        System.out.println("-----------------------------------");
        
        System.out.print("Ingrese el nombre del trabajador:");
        nombre = leer.nextLine();
        System.out.println("");
        System.out.print("Ingrese el tiempo de servicio en años del trabajador:");
        ant = leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese clave del trabajador:");
        clave = leer.nextInt();
        System.out.println("");
        
        if (clave == 1) {
            if (ant == 1) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 6 días de vacaciones.");
            }else if (ant >= 2 && ant <= 6) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 14 días de vacaciones.");
            }else if (ant >= 7) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 20 días de vacaciones.");
            }
            
        }else if (clave == 2) {
             if (ant == 1) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 7 días de vacaciones.");
            }else if (ant >= 2 && ant <= 6) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 15 días de vacaciones.");
            }else if (ant >= 7) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 22 días de vacaciones.");
            }
        }else if (clave == 3) {
             if (ant == 1) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 10 días de vacaciones.");
            }else if (ant >= 2 && ant <= 6) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 20 días de vacaciones.");
            }else if (ant >= 7) {
                System.out.println("El trabajador "+nombre+" tiene derecho a 30 días de vacaciones.");
            }
        }else {
            System.out.println("Error, la clave es incorrecta.");
            
        }
        
    }   
    
}
