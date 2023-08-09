package ServicioNif;

import Entidad.ClaseNif;
import java.util.Scanner;

public class ServicioNif {

    Scanner leer = new Scanner(System.in);

    public void crearNif(ClaseNif claseNif) {

        System.out.println("Ingrese DNI");
        claseNif.setDni(leer.nextInt());

        String[] LetraNif = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int letraNif;

        letraNif = claseNif.dni - ((claseNif.dni / 23) * 23);

        claseNif.setNif(LetraNif[letraNif]);
    }

    public void mostrar(ClaseNif claseNif) {

        System.out.println(claseNif.getDni() + "-" + claseNif.getNif());

    }

}
