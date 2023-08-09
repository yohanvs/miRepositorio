package pooej2;

import Entidad.Circunferencia;

public class PooEj2 {

    public static void main(String[] args) {
         
     //Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
        //tipo real. A continuación, se deben crear los siguientes métodos:
        //a) Método constructor que inicialice el radio pasado como parámetro.
        //b) Métodos get y set para el atributo radio de la clase Circunferencia.
        //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
        //d) Método area(): para calcular el área de la circunferencia (area = pi ∗ (radio * radio)).
        //e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
      
        Circunferencia l = new Circunferencia(5.0);//le damos un valor a radio
        
        System.out.println("El área ingresada por parámetro es: ");
        System.out.println(l.getRadio());   //mostramos con get
        
        System.out.println("Ahora cambiamos el valor con set a: ");
        l.setRadio(8.5);                    //cambiamos el valor de radio con set
        System.out.println(l.getRadio());   //volvemos a mostrar con get
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Finalmente calculamos el área y perímetro de la circunferencia.");
        System.out.println("Area: "+l.area());              //mostramos area       
        System.out.println("Perimetro: "+l.perimetro());    //mostramos perimetro 
    }
    
}
