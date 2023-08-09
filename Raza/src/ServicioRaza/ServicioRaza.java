
package ServicioRaza;

import EntidadRaza.EntidadRaza;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioRaza {
    
   /* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
    
    
    
    Scanner scanner = new Scanner(System.in);
    
   
    
    public void leerRazas(EntidadRaza entidadRaza){
         ArrayList<String> razas = new ArrayList();
        boolean r1 = false;
        String r = "";
        
        do {
            System.out.println("Ingrese una raza");
            
            razas.add(scanner.next());
            
            System.out.println("desea ingresar otra raza?(s/n)");
            r = scanner.next();
            if (r.equals("n")) {
                r1 = true;
                System.out.println("Saliendo...");
                System.out.println("Razas creadas: ");
                for (String raza : razas) {
                    System.out.println(raza);
                }
            }
        } while (true);
        
        
        
        
        
        
        
            
        }
    }
    

