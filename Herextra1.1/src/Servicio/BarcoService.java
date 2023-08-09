
package Servicio;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.Scanner;

public class BarcoService {
    Scanner scanner = new Scanner(System.in);
    public Barco crearBarco(){
        Barco barco = new Barco(); 
        int opcion;
        do {
            System.out.println("Ingrese el barco que desee alquilar");
            System.out.println("1-Barco velero");
            System.out.println("2-Barco a motor");
            System.out.println("3-Yate");
            opcion = scanner.nextInt();           
        } while (opcion != 1 && opcion != 2 && opcion != 3); 
        
        System.out.println("Ingrese la matricula del barco");
        String matricula = scanner.next();
        System.out.println("Ingrese la eslora del barco");
        int eslora = scanner.nextInt();
        System.out.println("Ingrese el año de fabricación");
        int anioBarco = scanner.nextInt();
        
        switch(opcion){
        
            case 1:
                System.out.println("Ingrese la cantidad de mastiles");
                int mastiles = scanner.nextInt();
                Velero velero = new Velero(mastiles, matricula, eslora, anioBarco); 
                return velero;
            case 2:
                System.out.println("Ingrese la potencia del barco");
                int potencia = scanner.nextInt();
                BarcoMotor barcoMotor = new BarcoMotor(potencia,matricula,eslora,anioBarco);
                return barcoMotor;
            case 3:
                System.out.println("Ingrese la potencia del barco");
                int potenciaYate = scanner.nextInt();
                System.out.println("Ingrese la cantidad de camarotes del barco");
                int camarotes = scanner.nextInt();
                Yate yate = new Yate(camarotes, potenciaYate, matricula, eslora, anioBarco);
                return yate;
            default:
                return barco;
            }
        
    
    }
}
