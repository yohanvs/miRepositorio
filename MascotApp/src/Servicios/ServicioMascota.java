package Servicios;
import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {

    private Scanner scanner;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.mascotas = new ArrayList();
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }
          
    public Mascota crearMascota() {

        System.out.println("Introducir nombre");
        String nombre = scanner.next();
       
        System.out.println("Introducir apodo");
        String apodo = scanner.next();
        
        System.out.println("Introducir tipo");
        String tipo = scanner.next();
        
        System.out.println("Introducir edad");
        Integer edad = scanner.nextInt();
        
        return new Mascota(nombre, apodo, tipo, edad);
        
       
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
        
    }
    
    public void mostrarMascota(){
    
        System.out.println("Las mascotas actuales de la lista Mascotas son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " +mascotas.size());
    }
    //Para crear muuchas tofys.
    public void fabricaTofys(int cantidad){
    
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Tofy", "Grizzli", "Perro", 7));
        }
    
    }
    //Para crear diferentes mascotas.
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota  mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
        
    
    }
    
    public void actualizarMascota(int index){
        if (index <= (mascotas.size()-1)) {
            System.out.println("");
            System.out.println("----Actualizar----");
            Mascota m = mascotas.get(index);
            m.setApodo("Roberto");
        }else{
            System.out.println("Fallo al actualizar, el indice es erroneo");
        }
        
    
    }
    
    public void eliminarMascota(int index){
        
        if (index <= (mascotas.size()-1)) {
            mascotas.remove(index);
        }else{
            System.out.println("Fallo al eleiminar, el indice es erroneo");
        }
    }
    
    public void eliminarPorNombre(String nombre){
    
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i); 
                
            }
        }
        
    }
    
    public void actualizarPorNombre(String nombreViejo, String nombreNuevo){
    
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombreViejo)) {
                m.setNombre(nombreNuevo);
            }
        }
        
    }
}
    
    

