
package Main;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList();
        
        Animal perro1 = new Perro("Bambi", "Carne", 6, "Pastor alemán");
        animales.add(perro1);
        Animal perro2 = new Perro("Toffy", "Manzana", 15, "Chocolate");
        animales.add(perro2);
        Animal gato1 = new Gato ("Tiago", "Todo", 30, "Amarillo");
        animales.add(gato1);
        Animal gato2 = new Gato ("Takion", "Todo", 4, "Blanco/Gris");
        animales.add(gato2);
        Animal gato3 = new Gato ("Fusu", "Todo", 7, "Negro");
        animales.add(gato3);
        Animal caballo1 = new Caballo("Tornado", "Pasto", 3, "Negro");
        animales.add(caballo1);
        
        for (Animal animal : animales) {
            animal.alimento();
        }
    }
    
}
