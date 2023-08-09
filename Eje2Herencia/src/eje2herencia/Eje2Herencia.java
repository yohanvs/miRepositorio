package eje2herencia;

import entidades.electrodomesticos.Electrodomesticos;
import entidades.electrodomesticos.Lavadora;
import entidades.electrodomesticos.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eje2Herencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Electrodomesticos> electrodomesticos = new ArrayList();
        
        
        
        Lavadora lavadora1 = new Lavadora(20, 1000d, "Blanco", 1000d, 25d);
        Lavadora lavadora2 = new Lavadora(50, 1000d, "Azul", 800d, 50d);
        Televisor televisor1 = new Televisor(50, true, 1000d, "Negro",1000d, 10d);
        Televisor televisor2 = new Televisor(24, false, 1000d, "Blanco", 800d, 3d);                    
        
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        electrodomesticos.add(lavadora2);
        
        for (Electrodomesticos electrodomestico : electrodomesticos) {
            
            if (electrodomestico instanceof Lavadora) {
                Lavadora object = (Lavadora) electrodomestico;
                lavadora1.precioFinal1();
                System.out.println(lavadora1.toString());
            }
            
            if (electrodomestico instanceof Lavadora) {
                Lavadora object = (Lavadora) electrodomestico;
                lavadora2.precioFinal1();
                System.out.println(lavadora2.toString());
            }
            
            if (electrodomestico instanceof Televisor) {
                Televisor object = (Televisor) electrodomestico;
                televisor1.precioFinal1();
                System.out.println(televisor1.toString());
            }
            
            if (electrodomestico instanceof Televisor) {
                Televisor object = (Televisor) electrodomestico;
                televisor2.precioFinal1();
                System.out.println(televisor2.toString());
                
                System.out.println("El valor total de los electrodomesticos es:");
                 System.out.println((lavadora1.getPrecio()+lavadora2.getPrecio()+televisor1.getPrecio()+televisor2.getPrecio()));
                    break;
            }
            
            
        }
        
        
        /*
        char menu;

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Bievenido a DAKA. ¿Que desea comprar?");
            System.out.println("1-Lavadora");
            System.out.println("2-Televisor");
            System.out.println("3-Ver precio total");
            System.out.println("4-Salir");
            System.out.println("-----------------------------------------");
            menu = scanner.next().toUpperCase().charAt(0);

            switch (menu) {

                case '1':

                    lavadora1.crearLavadora();
                    System.out.println(lavadora1.toString());
                    lavadora1.precioFinal1();
                    System.out.println(lavadora1.getPrecio());
                    continue;

                case '2':

                    televisor1.crearTelevisor();
                    System.out.println(televisor1.toString());
                    televisor1.precioFinal1();
                    
                    continue;
                
                case '3':
                    
                    System.out.println("Precio total de electrodomesticos = "+(lavadora1.getPrecio()+televisor1.getPrecio()));
                    continue;
                    
                case '4':
                    
                    System.out.println("Saliendo...");
                    break;

            }

        } while (menu != '4');
        

        */
    }

}
