package mascotapp;

import Entidades.Mascota;
import Servicios.ServicioMascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import mascotapp.utilidades.Comparadores;

public class MascotApp {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
       HashMap<String, Mascota> mascotas = new HashMap();
        
       mascotas.put("1", new Mascota("Tofy", "Gorda", "Perro", 8));
       mascotas.put("2", new Mascota("ponpon", "malo", "conejo", 2));
       
       mascotas.remove("2");
       
        for (Map.Entry<String, Mascota> entry : mascotas.entrySet()) {
            String key = entry.getKey();
            Mascota value = entry.getValue();
            System.out.println("key "+ key + " value "+value);
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* ArrayList<Mascota> mascotas = new ArrayList();
        
        mascotas.add(new Mascota("fer", "gorda", "perro", 7));
        mascotas.add(new Mascota("pepa", "gordo", "conejo", 2));
        
        
        
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
        Collections.shuffle(mascotas);
        
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }
*/
    }
}
