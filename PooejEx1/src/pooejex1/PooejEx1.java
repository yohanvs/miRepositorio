
package pooejex1;

import Entidad.Cancion;
import Servicio.ServicioCancion;

public class PooejEx1 {

    public static void main(String[] args) {
        /*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
        definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
        vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
        además definir los métodos getters y setters correspondientes.*/
        
        ServicioCancion sc = new ServicioCancion();
        
        Cancion cancion1 = new Cancion();
        
        sc.crearCancion(cancion1);
        
        System.out.println(cancion1.toString());
        
    }
    
}
