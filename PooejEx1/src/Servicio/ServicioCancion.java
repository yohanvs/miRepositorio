
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

public class ServicioCancion {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearCancion(Cancion c1){
        
        String[][] canciones= new String[5][5];
        
        for (int i = 0; i < 4; i++) {
            
            Cancion d1 = new Cancion();
            System.out.println("Ingrese el nombre del autor");
        String autor = leer.nextLine();
        c1.setAutor(autor);
        System.out.println("Ingrese el titulo de la canción");
        c1.setTitulo(leer.nextLine());
        }
        
    }
    
    
    
}
