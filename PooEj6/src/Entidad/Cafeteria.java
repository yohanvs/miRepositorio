
package Entidad;

import java.util.Scanner;

public class Cafeteria {
    
    Scanner leer = new Scanner(System.in);
    public int CapacidadMaxima; 
    public int CantidadActual;
    public int TamañoTaza;
    public int Cargar;
 
    public Cafeteria(){
    }

    public Cafeteria(int CapacidadMaxima, int CantidadActual, int TamañoTaza, int Cargar) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
        this.TamañoTaza = TamañoTaza;
        this.Cargar = Cargar;
    }

    public int getTamañoTaza() {
        return TamañoTaza;
    }

    public void setTamañoTaza(int TamañoTaza) {
        this.TamañoTaza = TamañoTaza;
    }

    public int getCargar() {
        return Cargar;
    }

    public void setCargar(int Cargar) {
        this.Cargar = Cargar;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public int llenarCafetera(){
        return CantidadActual=CapacidadMaxima;
        
    }
     //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
            //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
            //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
            //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
            //cuanto quedó la taza.
    public void servirTaza(int parataza) {
        int t1,t2,t3;
        
        int opcion;      
                   System.out.println("Ingrese el tamaño de taza de quiere");
                   System.out.println("1-100ml");
                   System.out.println("2-200ml");
                   System.out.println("3-300ml");
                   opcion = leer.nextInt();
                   switch(opcion){
                                    
                                case 1:
                                    t1 =100;
                                    if (parataza == t1) {
                                        CantidadActual -= parataza;
                                        System.out.println("La taza de "+t1+"ml se llenó");                                      
                                    }else if(parataza < 100){
                                        CantidadActual -= parataza;
                                        System.out.println("La taza de "+t1+"ml se llenó sólo con"+parataza+"ml");
                                    }else{
                                        CantidadActual -= parataza;                                       
                                        System.out.println("Fue demasiado café para taza y se derramó");
                                    }
                                     break;
                                case 2:
                                    t2=200;
                                    if (parataza ==t2) {
                                        CantidadActual-=parataza;
                                        System.out.println("La taza de "+t2+"ml se llenó");
                                    }else if(parataza < 200){
                                        CantidadActual-=parataza;
                                        System.out.println("La taza de "+t2+"ml se llenó sólo con "+parataza+"ml");
                                    }else{
                                        CantidadActual-=parataza;
                                        System.out.println("Fue demasiado café para la taza y se derramó");
                                    }
                                    break;
                                case 3:
                                    t3=300;
                                    if(parataza ==t3){
                                        CantidadActual-=parataza;
                                        System.out.println("La taza de "+t3+"ml se llenó");
                                    }else if(parataza < t3){
                                        CantidadActual-=parataza;
                                        System.out.println("La taza de"+t3+"ml se llenó sólo con "+parataza+"ml");
                                    }else{
                                        CantidadActual-=parataza;
                                        System.out.println("Fue demasiado café para la taza y se derramó");
                                    }
                                    break;
                                default:
                                    System.out.println("La opción que ingresaste no está disponible.");
                                    
                   }   
    }  
        
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public int vaciarCafetera(){
        return CantidadActual = 0;     
    }
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
            //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int Cargar) {
        int c = Cargar + CantidadActual;
        if (CapacidadMaxima >= c ) {
            CantidadActual = CantidadActual + Cargar;
            System.out.println("Se agregó a la cafetera "+Cargar+"ml de café.");
        }else{
            System.out.println("Es demasiado café, no puedes hacer eso.");
            
        }
        
    }
    
        
    
}
