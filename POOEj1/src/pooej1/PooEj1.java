
package pooej1;

import Entidad.Libro;
import java.util.Scanner;

public class PooEj1 {

    public static void main(String[] args) {
        
        //Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        //Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        //constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        //luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        //numero de páginas.
        
        Scanner leer = new Scanner(System.in);
        
        Libro l = new Libro(123456789, "Contando", "El contador" , 9);
        
        System.out.println("BIENVENIDO A LA LIBRERÍA.");
        
        l.setISBN(987654321); //en esta línea usamos el "set" para cambiar el valor de ISBN.
        l.leer(100); //esta línea marca cuanta de energía va a restar cada vez que lea.
        
        
        System.out.println(l); //en esta línea usamos la variable del libro "l" para mostrar todos los datos que se han guardado ahí con un toString.
        
    }
    
}
