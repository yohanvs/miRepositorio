
package eggejercicios;

import java.util.Scanner;

public class EggEjercicio14 {
    public static void main(String[] args){
        
     //Crea una aplicación que a través de una función nos convierta una 
     //cantidad de euros introducida por teclado a otra moneda, estas pueden 
     //ser a dólares, yenes o libras. La función tendrá como parámetros, 
     //la cantidad de euros y la moneda a converir que será una cadena, 
     //este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
     //   El cambio de divisas es:
     //   * 0.86 libras es un 1 €
     //   * 1.28611 $ es un 1 €
     //   * 129.852 yenes es un 1 €
    
     
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Calculador de DIVISAS.");
     System.out.println("Ingrese un valor en Euros para convertir a otras monedas");
     double euro = leer.nextDouble();
     
        System.out.println("El cambio de divisas es: ");
        System.out.println(" ");
        System.out.println("*"+euro+" euros -> "+dolar(euro)+" dólares.");
        System.out.println("*"+euro+" euros -> "+yen(euro)+" yenes.");
        System.out.println("*"+euro+" euros -> "+libra(euro)+" libras esterlinas.");
        System.out.println("*"+euro+" euros -> "+pesoArg(euro)+" pesos argentinos.");
        System.out.println("*"+euro+" euros -> "+pesoCo(euro)+" pesos colombianos.");
        System.out.println("*"+euro+" euros -> "+pesoMx(euro)+" pesos mexicanos.");
        System.out.println("*"+euro+" euros -> "+sol(euro)+" soles peruanos.");
        System.out.println("*"+euro+" euros -> "+pesoChi(euro)+" pesos chilenos.");
        System.out.println("*"+euro+" euros -> "+real(euro)+" reales brasileños.");
        System.out.println("*"+euro+" euros -> "+yuan(euro)+" yuanes chinos.");
     
     }
    public static double dolar(double euro){
       
        double dolar = euro * 1.28;
        return dolar; 
    }
     public static double yen(double euro){
     
         double yenes = euro * 129.852;
         return yenes;
     }
     public static double libra(double euro){
         
         double libra = euro * 0.86;
         return libra;
     }
     public static double pesoArg(double euro){
         
         double pesoArg = euro * 660;
         return pesoArg;
     }
     public static double pesoCo(double euro){
         
         double pesoCo = euro * 6000;
         return pesoCo;
     }
     public static double pesoMx(double euro){
         
         double pesoMx = euro * 20;
         return pesoMx;
     }
     public static double sol(double euro){
     
         double sol = euro * 3.68;
         return sol;
     }
     public static double pesoChi(double euro){
         
         double pesoChi = euro * 860;
         return pesoChi;
     }
     public static double real(double euro){
     
         double real = euro * 5.36;
         return real;
     }
     public static double yuan(double euro){
         
         double yuan = euro * 7.59;
         return yuan;
     
     }
     
}

