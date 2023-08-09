/*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.*/
package Servicio;

import Entidades.Alquiler;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {
    
    Scanner scanner = new Scanner(System.in);
    public Alquiler alquiler(){
        BarcoService bs = new BarcoService();
        Alquiler alquiler = new Alquiler();
        System.out.println("Ingrese nombre de cliente");
        alquiler.setNombre(scanner.nextLine());
        System.out.println("Ingrese documento del cliente");
        alquiler.setDNI(scanner.nextInt());
        System.out.println("Ingrese la fecha de alquiler DD/MM/AAAA");
        String fecha = scanner.next();
        int dia = Integer.valueOf(fecha.substring(0, 2));
        int mes = Integer.valueOf(fecha.substring(3, 5));
        int anio = Integer.valueOf(fecha.substring(6, 10)); 
        Date fechaAlquiler = new Date(anio-1900,mes-1,dia);
        System.out.println("Ingrese la fecha de devolucion DD/MM/AAAA");
        fecha = scanner.next();
        dia = Integer.valueOf(fecha.substring(0, 2));
        mes = Integer.valueOf(fecha.substring(3, 5));
        anio = Integer.valueOf(fecha.substring(6, 10));
        Date fechaDevolucion = new Date(anio-1900,mes-1,dia);
        alquiler.setFechaDevolucion(fechaDevolucion);
        System.out.println("Ingrese la posición amarre del barco");
        int posicion = scanner.nextInt();
        alquiler.setPosicionAmarre(posicion);
        alquiler.setBarco(bs.crearBarco());
            return alquiler;
        }
     
    
    public void costoAlquiler(Alquiler alquiler){
        int diasOcupacion = calcularFecha(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion());    
        int modulo = diasOcupacion * 10 * alquiler.getBarco().getEslora();
        if (alquiler.getBarco() instanceof Velero) {
            Velero velero = (Velero) alquiler.getBarco();
            modulo *= velero.getNumeroDeMastiles();
        }else if(alquiler.getBarco() instanceof BarcoMotor){
            BarcoMotor barcomotor = (BarcoMotor) alquiler.getBarco();
            modulo *=barcomotor.getPotencia();
        }else{
            Yate yate = (Yate) alquiler.getBarco();
            modulo*=yate.getPotencia()* yate.getNumeroCamarotes();
        }
        System.out.println("El costo del alquiler es de: "+modulo);
    }
    
    public int calcularFecha(Date fechaAlquiler, Date fechaDevolucion){             
        return (int)((fechaDevolucion.getTime()- fechaAlquiler.getTime())/(24 * 60 * 60 * 1000)); 
    }
}


