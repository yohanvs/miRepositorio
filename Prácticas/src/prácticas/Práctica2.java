package prácticas;

import java.util.Scanner;

public class Práctica2 {

    public static void main(String[] args) {
        //Calculadora básica
        
        
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo valor");
        int num2 = leer.nextInt();
        
        do {
            
            System.out.println("--------------");
            System.out.println("Eilje opción");
            System.out.println("--------------");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicación");
            System.out.println("4-División");
            System.out.println("5-Salir");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("la suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicación de " + num1 + " y " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("la división de " + num1 + " y " + num2 + " es " + (num1 / num2));
                    break;
                default:
                    System.out.println("No puedes hacer eso.");
            }
        } while (opcion != 5);
    }
}
