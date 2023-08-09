
package eggejercicios;

public class EggEjercicio15 {
    public static void main (String[]args){
    
    //Realizar un algoritmo que rellene un vector con los 100 primeros 
    //números enteros y los muestre por pantalla en orden descendente.
    
    
    
    int a = 100;
    int vector[] = new int[a];
        for (int i = 0; i < a; i++) {
            vector[i] = 100 - i;
        }
    
        r(vector,a);
    
    }
   
    public static void r(int vector[] , int a){
        
        for (int i = 0; i < a; i++) {
            System.out.println("["+vector[i]+"]");
        }
 
    }
    
}
