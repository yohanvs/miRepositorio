
package RuleraRusa.Servicio;

import java.util.ArrayList;
import ruletarusa.Entidades.Jugador;
import ruletarusa.Entidades.RevolverAgua;

public class Juego {
    
    private ArrayList<Jugador>jugadores;
    private RevolverAgua revolveragua;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolveragua) {
        this.jugadores = jugadores;
        this.revolveragua = revolveragua;
    }
    
    public void llenarJugadores(){
    
        ArrayList<Jugador>jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador(1, "Yohan"));
        jugadores.add(new Jugador(2, "Robert"));
        jugadores.add(new Jugador(3, "Vicky"));
        jugadores.add(new Jugador(4, "Julian"));
        jugadores.add(new Jugador(5, "Albert"));
        jugadores.add(new Jugador(6, "Marco"));
    
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
    }
    
    public void llenarJuego(RevolverAgua revolveragua){
    
        revolveragua.llenarRevolver();
        llenarJugadores();
        
        
    }
    
    public void ronda(){
    
        System.out.println("Que empiece el juego");
        
        for (Jugador jugadore : jugadores) {
            if (jugadore.getId() == ) {
                
            }
        }
        
        
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolveragua=" + revolveragua + '}';
    }
    
}
