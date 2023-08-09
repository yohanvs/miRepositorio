/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
public class ServicioPuntos {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearPuntos(Puntos p1){
        
        System.out.println("Ingrese el valor de x1");
        p1.setX1(leer.nextDouble());
        System.out.println("Ingrese el valor de y1");
        p1.setY1(leer.nextDouble());
        System.out.println("Ingrese el valor de x2");
        p1.setX2(leer.nextDouble());
        System.out.println("Ingrese el valor de y2");
        p1.setY2(leer.nextDouble());
        
        
    }
    
    public void calcularDistancia(Puntos p1) {
        double distancia = Math.sqrt(Math.pow(p1.x2 - p1.x1, 2) + Math.pow(p1.getY2() - p1.getY1(), 2));
      
         System.out.println("La distancia entre los puntos es: "+distancia);   
    }
    
    
}
