
package Ejemplo1.ServicioAlumnos;

import Ejemplo1.Entidad.ClaseAlumnos;
import java.util.Scanner;

public class ServicioAlumnos {
    
    /*
     método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
    nombre de cada alumno.
    
     Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnos
    
     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
    
    */
    
    Scanner leer = new Scanner(System.in);
    
    public byte c = 0;
    
    public void cargarAlumnos(ClaseAlumnos claseAlumnos){
    
        System.out.println("Ingrese la cantidad de alumnos");
        
        int cantidad = 2;
        String[] nombres = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Por favor ingrese el nombre del alumno N°" +(i+1));
            nombres[i] = leer.nextLine();
            c++;      
        }
        
        claseAlumnos.setAlumnos(nombres);                                                
    }
    
    /*
     Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. xEn este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnosx
    */
    
    public void crearCurso(ClaseAlumnos claseAlumnos){
        
        System.out.println("Ingrese el nombre del curso");
                        
        claseAlumnos.setNombreCurso(leer.nextLine());
        
        System.out.println("Ingrese cantidad de horas por día");
        
        claseAlumnos.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Ingrese cantidad de dias por semana");
        
        claseAlumnos.setCantidadHorasPorSemana(leer.nextInt());
        
        System.out.println("Ingrese turno(mañana/tarde)");
        
        claseAlumnos.setTurno(leer.next());
        
        System.out.println("Ingrese precio por hora");
        
        claseAlumnos.setPrecioPorHora(leer.nextInt());
        
        
    }
    
    /*
     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
    */
    
    
    public void calcularGananciaSemanal(ClaseAlumnos claseAlumnos){
    
        int horaxdia = claseAlumnos.getCantidadHorasPorDia();
        int horasxsemana = claseAlumnos.getCantidadHorasPorSemana();
        int cantidadAlumnos = claseAlumnos.getAlumnos().length;
        int precioxhora =  claseAlumnos.getPrecioPorHora();
        
        int ganancias = horaxdia*horasxsemana*cantidadAlumnos*precioxhora;
        System.out.println("La gancia semanal es: "+ganancias);
        
    }
}
