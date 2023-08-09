
package Ejemplo1;

import Ejemplo1.Entidad.ClaseAlumnos;
import Ejemplo1.ServicioAlumnos.ServicioAlumnos;

public class Ejemplo1 {

    
    public static void main(String[] args) {
        
        
        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();
       
        ClaseAlumnos claseAlumnos = new ClaseAlumnos();
        
        servicioAlumnos.cargarAlumnos(claseAlumnos);
        
       System.out.println(claseAlumnos.toString());
       
       servicioAlumnos.crearCurso(claseAlumnos);
       
       servicioAlumnos.calcularGananciaSemanal(claseAlumnos);
    }
    
}
