package ejex4;

import Entidad.ClaseNif;
import ServicioNif.ServicioNif;
import java.util.Scanner;

public class EjEx4 {

    public static void main(String[] args) {     

        Scanner leer = new Scanner(System.in);

        ServicioNif servicioNif = new ServicioNif();

        ClaseNif claseNif = new ClaseNif();

        servicioNif.crearNif(claseNif);

        servicioNif.mostrar(claseNif);

    }

}
