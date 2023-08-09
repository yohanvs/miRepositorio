
package prácticas;
 
import java.util.Scanner;

public class Práctica4 {

    public static void main(String[] args) {
       //Ejemplo login básico.
        Scanner leer = new Scanner(System.in);
       /* 
        String user1 = "", passw = "";
        
        System.out.print("Por favor ingresa tu nombre de usuario: ");
        user1 = leer.nextLine();
        System.out.print("Por favor ingresa la contraseña: ");
        passw = leer.nextLine();
        
        if (user1.equals("ernesto") && passw.equals("123456")) {
            System.out.println("Inicio de sesión correcto");
        }else{
            System.out.println("Nombre de usuario ó contraseña incorrectos.");
        }
        */
       
       //Manipulación de cadenas
        
        String cade1, cade2;
        int numc = 0, desde = 0, hasta = 0;
        
        System.out.println("Ingrese una cadena de carácteres.");
        cade1 = leer.nextLine();
        numc = cade1.length();
        System.out.println("La cadena de carácteres "+cade1+" tiene "+numc+ " carácteres");
        
        System.out.println("Desde que carácter deseas obtener la cadena?");
        desde = leer.nextInt();
        
        System.out.println("Hasta que carácter deseas obtener la cadena?");
        hasta = leer.nextInt();
        
        cade2 = cade1.substring(desde, hasta);
        System.out.println("La nueva cadena es: "+cade2);
    }
    
}
