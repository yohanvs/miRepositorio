
package pooej7;

import Entidad.Persona;
import Servicios.ServiciosPersona;

public class PooEj7 {
    public static void main(String[] args) {
       
        //Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
        //sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
        //atributo, puede hacerlo. Los métodos que se implementarán son:
        /**Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
        significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
        Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
        persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
        de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
        función devuelve un 1.
         Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
        devuelve un booleano.
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
        tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        persona es mayor de edad.*/
        
        ServiciosPersona sp = new ServiciosPersona();
       
        //Persona p1 = sp.CrearPersona();
        Persona p1 = new Persona("Jose",14,"M",60,1.6);
            if (sp.CalcularIMC(p1) == -1) {
            System.out.println("La persona está por debajo de su peso ideal");
            }else if(sp.CalcularIMC(p1) == 0){
                System.out.println("La persona está en su peso ideal");
            }else if(sp.CalcularIMC(p1) ==1){
                System.out.println("La persona tiene sobrepeso");
            }
            if (sp.CalcularEdad(p1)== true) {
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
        
        //Persona p2 = sp.CrearPersona();
          Persona p2 = new Persona("Anna", 24,"F",40,1.70);  
          
            if (sp.CalcularIMC(p2) == -1) {
            System.out.println("La persona está por debajo de su peso ideal");
            }else if(sp.CalcularIMC(p2) == 0){
                System.out.println("La persona está en su peso ideal");
            }else if(sp.CalcularIMC(p2) ==1){
                System.out.println("La persona tiene sobrepeso");
            }
            if (sp.CalcularEdad(p2)== true) {
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
        //Persona p3 = sp.CrearPersona();
          Persona p3 = new Persona("Juan",30,"M",100,1.80);
          
            if (sp.CalcularIMC(p3) == -1) {
            System.out.println("La persona está por debajo de su peso ideal");
            }else if(sp.CalcularIMC(p3) == 0){
                System.out.println("La persona está en su peso ideal");
            }else if(sp.CalcularIMC(p3) ==1){
                System.out.println("La persona tiene sobrepeso");
            }
            if (sp.CalcularEdad(p3)== true) {
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
         //Persona p4 = sp.CrearPersona();  
         Persona p4 = new Persona("Rebe", 14,"F",60,1.40);
            if (sp.CalcularIMC(p4) == -1) {
            System.out.println("La persona está por debajo de su peso ideal");
            }else if(sp.CalcularIMC(p4) == 0){
                System.out.println("La persona está en su peso ideal");
            }else if(sp.CalcularIMC(p4) ==1){
                System.out.println("La persona tiene sobrepeso");
            }
            if (sp.CalcularEdad(p4)== true) {
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
            
       /** Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores */
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        int imc1 = sp.CalcularIMC(p1);
        int imc2 = sp.CalcularIMC(p2);
        int imc3 = sp.CalcularIMC(p3);
        int imc4 = sp.CalcularIMC(p4);
        
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        if (imc1 == -1) {
            c1++;
        }else if(imc1 == 0){
            c2++;
        }else {
            c3++;
        }
        if (imc2 == -1) {
            c1++;
        }else if(imc2 == 0){
            c2++;
        }else {
            c3++;
        }
        if (imc3 == -1) {
            c1++;
        }else if(imc3 == 0){
            c2++;
        }else {
            c3++;
        }
        if (imc4 == -1) {
            c1++;
        }else if(imc4 == 0){
            c2++;
        }else {
            c3++;
        }
        int total = 4;
        double pc1 = c1*100/total;
        double pc2 = c2*100/total;
        double pc3 = c3*100/total;
        
        System.out.println("Personas debajo de su peso idea "+pc1+"%");
        System.out.println("Personas en su peso ideal "+pc2+"%");
        System.out.println("Personas con sobrepeso "+pc3+"%");
        
        boolean edad1 = sp.CalcularEdad(p1);
        boolean edad2 = sp.CalcularEdad(p2);
        boolean edad3 = sp.CalcularEdad(p3);
        boolean edad4 = sp.CalcularEdad(p4);
        
        int k1 = 0;
        int k2 = 0;
        
    }
    
}
