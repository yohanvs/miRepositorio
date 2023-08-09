package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class ServiciosPersona {

    Scanner leer = new Scanner(System.in);

    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     */
    public Persona CrearPersona() {
        System.out.println("Ingresar nombre:");
            String nombre = leer.next();
        System.out.println("Ingrese edad:");
            byte edad = leer.nextByte();
            boolean x = true;
            String sexo;
            do {                         
            System.out.println("Ingrese sexo (M/F/O):");                                
                 sexo = leer.next().toLowerCase();
                if (sexo.equals("m") || sexo.equals("f")|| sexo.equals("o")) {
                    x=false;
                    System.out.println("Es correcto");  
                    }else{
                    System.out.println("Incorrecto, intente de nuevo");
                } 
            } while (x);
        System.out.println("Ingrese peso:");
            double peso = leer.nextDouble();
        System.out.println("Ingrese altura:");
            double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    /**
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     */
    public int CalcularIMC(Persona p) {
        double imc = p.peso / ((p.altura * p.altura));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else if (imc > 25) {
            return 1;
        }
        return 2;
    }

    public boolean CalcularEdad(Persona p) {
        if (p.edad > 17) {
            return true;
        }
        return false;
    }   
}
