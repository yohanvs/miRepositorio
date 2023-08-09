package eggejercicios;

import java.util.Scanner;

public class EggEjercicio11 {
    public static void main (String[] args){
        
       //Realizar un programa que pida dos números enteros positivos por 
       //teclado y muestre por pantalla el siguiente menú:
       
        Scanner leer = new Scanner(System.in);
        int opcion  ;     
        double num1 ;
        double num2 ;
        double suma ;
        double resta;
        double multi;
        double divi ;
        boolean salir = false; //iniciamos la variable salir en false porque el programa seguirá repitiendo hasta que la variable sea true.
        do {
            System.out.println("MENÚ.");
            System.out.println("1-Suma.");
            System.out.println("2-Resta.");
            System.out.println("3-Mutiplicar.");
            System.out.println("4-Dividir.");
            System.out.println("5-Salir.");
            System.out.println("Elija opción.");

            opcion = leer.nextInt();

            switch(opcion){

                case 1:    
                    System.out.println("Ingrese primer valor:");
                    num1 =leer.nextDouble();
                    System.out.println("Ingrese segundo valor");
                    num2 = leer.nextDouble();
                    suma = num1 + num2;
                    System.out.println("La suma es: "+suma);
                    break;
                
                case 2:
                    System.out.println("Ingrese primer valor");
                    num1 =leer.nextDouble();
                    System.out.println("Ingrese segundo valor");
                    num2 = leer.nextDouble();
                    resta = num1 - num2;
                    System.out.println("La resta es: "+resta);
                    break;
                
                case 3:
                    System.out.println("Ingrese primer valor");
                    num1 =leer.nextDouble();
                    System.out.println("Ingrese segundo valor");
                    num2 = leer.nextDouble();
                    multi = num1 * num2;
                    System.out.println("La multiplicación es: "+multi);
                    break;
                
                case 4:
                    System.out.println("Ingrese primer valor");
                    num1 =leer.nextDouble();
                    System.out.println("Ingrese segundo valor");
                    num2 = leer.nextDouble();
                    divi = num1 / num2;
                    System.out.println("La división es: "+divi);
                    break;
                case 5: 
                        System.out.println("Estás seguro que quieres salir (S-N)?");
                            leer.nextLine(); //limpiar buffer de entrada
                            char confirmar = leer.nextLine().charAt(0); //guardamos la 's' y 'S' en el char para usarlo en la variable confirmar para salir.
                            if(confirmar == 's' || confirmar == 'S'){
                                salir = true;  //Al entrar al case 5 y elegir la opción 's' la variable salir se vuelve verdadera y por fín podrá terminar el proceso.
                                System.out.println("Saliendo del programa...");
                                return;
                            }
                    break;
            
                default: 
                        System.out.println("Opción invalida.");
                    break;
        }      
                           
       } while (!salir);// "!salir" significa que si la variable salir es opuesta a false, el programa dejará de repetirse.
    }
    
}
