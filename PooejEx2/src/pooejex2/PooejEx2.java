
package pooejex2;

import Entidad.Puntos;
import Servicio.ServicioPuntos;

public class PooejEx2 {

    /**
     Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
    atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
    usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
    los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
    que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
    calcular la distancia entre dos puntos consulte el siguiente link:
     */
    public static void main(String[] args) {
       
        ServicioPuntos p1 = new ServicioPuntos();
        
        Puntos s1 = new Puntos();
        p1.crearPuntos(s1);
        System.out.println(s1.toString());
        p1.calcularDistancia(s1);
        
    }
    
}
