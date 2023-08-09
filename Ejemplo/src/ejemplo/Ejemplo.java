
package ejemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejemplo {

    public static void main(String[] args) {
      
        //Arrays
        
        /*String[] nombresArray = new String[5];
        
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito " + (i+1);
        }
        
        for (String var : nombresArray) {
            System.out.println(var);
            
        }
        
        
        //Collections
        
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("chiquito");
        
        System.out.println(nombresArrayList.size());
        */
        
        //LISTAS:
        
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x); //Agregamos el número 20.
        numerosA.add(x);
        numerosA.add(x);
        numerosA.add(x);
        numerosA.add(x);
        System.out.println("ArrayList numerosA: " + numerosA.size());
        System.out.println("Elemento de cada numeroA creado");
            for (Integer var1 : numerosA) {
               System.out.println(var1);
        }
        
        numerosA.remove(0);//Elimitar por indice.
        System.out.println("--------------------------------");                
        System.out.println("ArrayList numerosB luego de usar remove(indice): " + numerosA.size());
        System.out.println("Elemento de cada numeroA creado");
             for (Integer var1 : numerosA) {
                System.out.println(var1);
        }  
        System.out.println("----------------------------------");
        ArrayList<Integer> numerosB = new ArrayList();
        
        int o = 30;
        numerosB.add(o);
        numerosB.add(o);
        numerosB.add(o);
        numerosB.add(o);
        numerosB.add(o);

        Integer z = 30;
        System.out.println("ArrayList numerosB1: " + numerosB.size());
        System.out.println("Elemento de cada numeroB creado");
            for (Integer var1 : numerosB) {
               System.out.println(var1);
        }               
        
        System.out.println("------------------------------------");
        
        numerosB.remove(z);//Elimitar por elemento.
        
        System.out.println("ArrayList numerosB1: " + numerosB.size());
        System.out.println("ArrayList numerosB1 luego de usar remove(elemento): "+numerosB.size());
            for (Integer var1 : numerosB) {
                   System.out.println(var1);
            }
            
        System.out.println("-------------------------------");
        System.out.println("");
        
        //CONJUNTOS:
        
        HashSet<Integer> numerosC = new HashSet();
        Integer y = 20;
        numerosC.add(y); 
        numerosC.add(y); 
        
        
        System.out.println("Conjunto(HashSet) numerosC con elemento [y = 20]: "+numerosC.size());
        System.out.println("HashSet elementos:");
            for (Integer var1 : numerosC) {
                   System.out.println(var1);
            }
        System.out.println("---------------------------------------");    
        numerosC.remove(20);//Los conjuntos sólo remueven elementos ya que no tienen índice.
        
        System.out.println("Conjunto(HashSet) numerosC luego de usar el método remove(elemento): " + numerosC.size());
        System.out.println("HashSet elementos luego de usar el remove(elementos):");
            for (Integer var1 : numerosC) {
                   System.out.println(var1);
            }
        System.out.println("------------------------------------------");
        System.out.println("");
        //MAPAS:
        
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 23409951;
        String nombreAlumno = "Yohan";
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni, nombreAlumno);
        System.out.println("Mostrando sólo llaves del HashMap");
        for (Integer dni1 : alumnos.keySet()) {
            System.out.println("dni= "+dni1);
        }
        System.out.println("---------------------------------------");
        System.out.println("Mostrando sólo valores del HashMap");
        for (String alumnos1 : alumnos.values()) {
            System.out.println("dni= "+alumnos1);
        }
        System.out.println("--------------------------------------");
        System.out.println("5 HashMap con llave y elemento: "+alumnos.size());
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("dni= " + entry.getKey() + " nombre= " + entry.getValue());
        }
        System.out.println("--------------------------------------");
        
       
        alumnos.remove(23409951);//Sólo podemos remover llaves.
        
        System.out.println("HashMap luego de haber usado remove(llave): "+alumnos.size());
                
    }
    
}
