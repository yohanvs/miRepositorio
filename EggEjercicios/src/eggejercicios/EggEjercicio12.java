package eggejercicios;
import java.util.Scanner;
public class EggEjercicio12 {
    public static void main(String[] args){
    
    
        //Realizar un programa que simule el funcionamiento de un dispositivo 
    //RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
    //Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
    //de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
    
    //Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
    //especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
    //distinta de FDE, que no respete el formato se considera incorrecta.
   
    //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
    //correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
    //cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
    
       Scanner leer = new Scanner(System.in);
       
       System.out.println("INICIO DE DISPOSITIVO RS232");
       
       System.out.println("Por favor ingrese las cadenas(FDE para finalizar):");
       
       String cadena     ;
       int correcto   = 0;
       int incorrecto = 0;
       while(true){
       
           System.out.println("Ingrese cadena.");
           cadena = leer.nextLine(); 
            if(cadena.equals("&&&&&")){                                     //Si la cadena es igual a "$$$$$" entonces el programa finaliza.
                break;
            }
            if(validarCadena(cadena)){                                      //Usamos la función ValidarCadena para revisar si la cadena es correcta o no.
                correcto++;                                                 //Si es correcta la variable correcta aumenta en 1.
            }else{
                incorrecto++;                                               //Si es incorrecta la variable incorrecta aumenta en 1.
            }
        }
       
       System.out.println("Informe");                                       //Informe de todas las cadenas leídas.
       System.out.println("Las lecturas correctas son: "+correcto);
       System.out.println("Las lecturas incorrectas son: "+incorrecto);
    }
       
     public static boolean validarCadena(String cadena) {                   //Esta función se encarga de validar si la cadena es justo la que queremos o si no lo es.
        
         int longitud = cadena.length();
        
        if (longitud != 5) {
            return false;
        }
        
        char primerC = cadena.charAt(0);
        char ultimoC = cadena.charAt(longitud - 1);
        
        return (primerC == 'X' || ultimoC == 'O');
    }
}

        
    

