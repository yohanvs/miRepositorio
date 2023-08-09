package pooej3;

import Entidad.Operacion;
import java.util.Scanner;

public class PooEj3 {

    public static void main(String[] args) {
        //Crear una clase llamada Operacion que tenga como atributos privados numero1 y
            //numero2. A continuación, se deben crear los siguientes métodos:
            //a) Método constructor con todos los atributos pasados por parámetro.
            //b) Metodo constructor sin los atributos pasados por parámetro.
            //c) Métodos get y set.
            //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
            //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
            //f) Método restar(): calcular la resta de los números y devolver el resultado al main.
            //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
            //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("CALCULADORA.");
            System.out.println("Los primeros valores por defecto son.");
            
            Operacion l = new Operacion(10,10);
            
            System.out.println(l.getNum1());
            System.out.println(l.getNum2());
            
            System.out.println("Suma: " +l.Suma());
            System.out.println("Resta: "+l.Restar());
            System.out.println("Multiplicación: "+l.Multi());
            System.out.println("División: "+l.Divi());
            
            System.out.println("--------------------------------");
            
            Operacion p = new Operacion(0,0);
            
            System.out.println("Ahora ingrese dos valores que quiera calcular");           
            
            System.out.println("Ingrse primer valor:");
            p.setNum1(leer.nextDouble());
            
            System.out.println("Ingrese segundo valor:");
            p.setNum2(leer.nextDouble());
            
            System.out.println("--------------------------------");
            
            System.out.println("Suma: " +p.Suma());
            System.out.println("Resta: "+p.Restar());
            System.out.println("Multiplicación: "+p.Multi());
            System.out.println("División: "+p.Divi());
            
            
    }
    
}
