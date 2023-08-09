package Main;

import Entidades.Lavadora;
import Entidades.Televisor;
import Service.LavadoraService;
import Service.TelevisorService;

public class Main {

    public static void main(String[] args) {

        /*Finalmente, en el main debemos realizar lo siguiente:
    Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
    el precio final de los dos electrodomésticos.*/
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        System.out.println("Crear Lavadora");
        Lavadora l1 = ls.crearLavadora();
        /*System.out.println("Crear Televisor");
        Televisor t1 = ts.crearTelevisor();
        */
        System.out.println("Precio Lavadora");
        System.out.println();
        ls.precioFinal(l1);
        /*System.out.println("Precio televisor");
        ts.precioFinal(t1);
        */
    }

}
