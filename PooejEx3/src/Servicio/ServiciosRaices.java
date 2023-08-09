
package Servicio;

import Entidad.Raices;

public class ServiciosRaices {
    
    /*
    Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

     Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c

     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.

     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.

     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
    
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
    
    Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
    */
    
    
    public void getDiscriminante(Raices r1){
        double discriminante = ((r1.b)* 2)-4 * r1.a * r1.c;
        System.out.println("El valor discriminante es: "+discriminante);
    }
    
    public boolean tieneRaices(Raices r1, double discriminante){
        if (discriminante >= 0) {
            System.out.println("El valor es mayor o igual que 0");
            return true;
            
        }
        System.out.println("El valor no es mayor ni igual que 0");
        return false;
    }
    
    public boolean tieneRaiz(Raices r1, double discriminante){
    
        if (discriminante == 0) {            
            return true;           
        }
        return false;
    }
    
    
    
}
