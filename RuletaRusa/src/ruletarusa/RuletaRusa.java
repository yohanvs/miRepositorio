
package ruletarusa;

import RuleraRusa.Servicio.Juego;
import ruletarusa.Entidades.RevolverAgua;

public class RuletaRusa {

    public static void main(String[] args) {
     
        RevolverAgua revolveragua = new RevolverAgua();
        Juego juego = new Juego();
        
        juego.llenarJuego(revolveragua);
        juego.ronda();
        
    }
    
}
