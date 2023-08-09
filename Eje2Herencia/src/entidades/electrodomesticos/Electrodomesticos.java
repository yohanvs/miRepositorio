
package entidades.electrodomesticos;

import java.util.Scanner;

public class Electrodomesticos  {
    
    Scanner scanner = new Scanner(System.in);

    protected Double precio; 
    protected String color;
    protected Double consumo;
    protected Double peso;
    protected char opcionconsumo;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, Double consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

   public void comprobarConsumo(){
       
       System.out.println("Que valor de consumo tiene entre las letras A,B,C,D,E,F?");
       opcionconsumo = scanner.next().toUpperCase().charAt(0);
      
       
       switch (opcionconsumo) {
            case 'A':
                System.out.println("A");
                consumo= 1000d;
                break;
            case 'B':
                System.out.println("B");
                consumo= 800d;
                break;
            case 'C':
                System.out.println("C");
                consumo= 600d;
                break;
            case 'D':
                System.out.println("D");
                consumo= 500d;
                break;
            case 'E':
                System.out.println("E");
                consumo= 300d;
                break;
            case 'F':
                System.out.println("F");
                consumo= 100d;
                break;            
            default:
                System.out.println("Por default el consumo es F");
                consumo= 100d;
                break;
        }
   
   }
   
   public void comprobarColor(){
   
       System.out.println("Que color tiene el electrodoméstico?");
       color = scanner.next();
              
   }
   
   public void comprobarPeso(){
   
       System.out.println("Cuanto pesa el electrodomestico?");
       peso = scanner.nextDouble();
   }
    
   public void crearElectrodomestico(){
   
       comprobarConsumo();
       comprobarColor(); 
       comprobarPeso();
   
   }
   
   public void precioFinal(){
       
       double calcularPeso = 0;
       
       if (peso > 0 && peso < 20) {
           calcularPeso = 100d;                              
       }
       if (peso >= 20 && peso <= 49) {
           calcularPeso = 500d;                              
       }
       if (peso >= 50 && peso <= 79) {
           calcularPeso = 800d;                              
       }
       if (peso >= 80) {
           calcularPeso = 1000d;                             
       }
       precio += consumo + calcularPeso;
       
   }
   
  
}
