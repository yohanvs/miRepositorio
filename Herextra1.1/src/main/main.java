package main;


import Entidades.Alquiler;
import Servicio.AlquilerService;

public class main {

    public static void main(String[] args) {
        
        AlquilerService as = new AlquilerService();
        Alquiler alquiler = as.alquiler();
        as.costoAlquiler(alquiler);
        
    }
    
}
