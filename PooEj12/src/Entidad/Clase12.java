
package Entidad;

import java.util.Date;
import java.util.Scanner;


public class Clase12 {
    Scanner leer = new Scanner(System.in);
    private String n1;
    private Date FechaNacimiento;

    public Clase12() {
    }

    public Clase12(String n1, Date FechaNacimiento) {
        this.n1 = n1;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return "Clase12{" + "n1=" + n1 + ", FechaNacimiento=" + FechaNacimiento + '}';
    }
    
    public crearP CrearPersona(){
        
        int dia1,mes1,anio1;
        Date fechaActual = new Date();
        
        System.out.println("Como se llama la primera persona?: ");
        n1 = leer.next();
        System.out.println("Ingrese la fecha de nacimiento de la primera persona");
        System.out.println("día: ");
        dia1 = leer.nextInt();
        System.out.println("mes: ");
        mes1 = leer.nextInt();
        System.out.println("Año: ");
        anio1 = leer.nextInt();
        
        Date fechaNacimiento1 = new Date(anio1-1900,mes1-1,dia1);       
        
        int edad = fechaActual.getYear() - fechaNacimiento1.getYear();
        
        System.out.println("La fecha de nacimiento de "+n1+" es "+edad);
        
    
    }
    
}
