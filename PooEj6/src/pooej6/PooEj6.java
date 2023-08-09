
package pooej6;

import Entidad.Cafeteria;
import java.util.Scanner;

public class PooEj6 {
    public static void main(String[] args) {
        
            //Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
            //la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
            //cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
            //métodos:
            //Constructor predeterminado o vacío
            //Constructor con la capacidad máxima y la cantidad actual
            //Métodos getters y setters.
            //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
            //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
            //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
            //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
            //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
            //cuanto quedó la taza.
            //Método vaciarCafetera(): pone la cantidad de café actual en cero.
            //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
            //recibe y se añade a la cafetera la cantidad de café indicada.
            
            Scanner leer = new Scanner(System.in);
            
            Cafeteria cafe1 = new Cafeteria();
            
            System.out.println("Que tal un café(s/n)?");
             cafe1.setCapacidadMaxima(1000);
             cafe1.setCantidadActual(500);
            boolean s;
            String s1 = leer.nextLine();
            if (s1.equals("s")|| s1.equals("S") ) {
                int opcion;
                do {
                   
                    System.out.println("-----------------------");
                    System.out.println("Que deseas?");
                    System.out.println("1-Servir una taza de café.");
                    System.out.println("2-Llenar la cafetera al máximo.");
                    System.out.println("3-Vaciar la cafetera.");
                    System.out.println("4-Revisar cuanto café hay.");
                    System.out.println("5-Agregar café a la cafetera.");
                    System.out.println("6-Salir.");
                    System.out.println("-----------------------");                
                    opcion = leer.nextInt();
                    
                    switch (opcion){
                        
                        case 1:
                            System.out.print("Ingrese la cantidad de cafe de la taza: ");
                            cafe1.servirTaza(leer.nextInt());
                            System.out.println("--------------------------------");
                            System.out.println("Cantidad actual de café " + cafe1.CantidadActual+ "ml");
                            break;
                        case 2:
                            System.out.println("--------------------------------");
                            System.out.println("Llenando cafetera...");
                            cafe1.setCapacidadMaxima(cafe1.llenarCafetera());
                            System.out.println("La cafetera se llenó al máximo: "+cafe1.llenarCafetera()+"ml");
                            break;
                        case 3:
                            System.out.println("--------------------------------");
                            System.out.println("Vaciando la Cafetera...");
                            cafe1.setCantidadActual(cafe1.vaciarCafetera());
                            System.out.println("--------------------------------");
                            System.out.println("La Cafetera se ha vaciado y quedo en " + cafe1.getCantidadActual() + "ml de Café");
                            break;
                        case 4:
                            System.out.println("--------------------------------");                            
                            System.out.println("Quedan "+cafe1.CantidadActual+"ml de café en la cafetera.");
                            break;    
                        case 5:
                            System.out.println("--------------------------------");
                            System.out.println("Cuanto café deseas agregar a la cafetera?");
                            cafe1.agregarCafe(leer.nextInt());
                        default:
                            System.out.println("La opción ingresada no está disponible");
                            
                    }
                } while (opcion!= 6);     
            } else {
                System.out.println("Entonces hasta luego");
                }   
    }    
}
