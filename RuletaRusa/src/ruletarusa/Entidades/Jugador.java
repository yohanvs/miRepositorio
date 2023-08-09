
package ruletarusa.Entidades;

public class Jugador {
    
    private Integer id;
    private String nombre;
    private boolean mojado;


    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    public boolean disparo(RevolverAgua revolveragua){
    
        if (revolveragua.mojar()) {
            mojado = true;
            return mojado;
        }else{
            revolveragua.siguienteChorro();
            return false;
        }
    }
    
}
