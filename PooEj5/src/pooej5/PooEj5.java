
package pooej5;

import Entidad.Cuenta;
import java.util.Scanner;

public class PooEj5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
            
            Cuenta user1 = new Cuenta(10001,0,0);
            
            System.out.println("Bienvenido al BancoPompon.");
            System.out.println("Vamos a crear una cuenta.");
            System.out.println(" ");
            
            System.out.println("Ingrese su DNI: ");
            user1.setDNI(leer.nextInt());
            
            System.out.println("Ingrese saldo a depositar: ");
            user1.setSaldoActual(leer.nextInt());
            
            System.out.println("Los datos ingresados son:");
            System.out.println("DNI:"+user1.getDNI());
            System.out.println("Nùmero de cuenta: "+user1.getNumeroCuenta());
            System.out.println("Saldo: "+user1.getSaldoActual());
            System.out.println("Deposite màs saldo para continuar: ");
            user1.IngresarSaldo();
            System.out.println("Saldo actual: "+user1.getSaldoActual());
            System.out.println("Aprovecha y retira algo de dinero.");
            user1.RetirarSaldo();
            System.out.println("Saldo actual: "+user1.getSaldoActual());         
    }
    
}
