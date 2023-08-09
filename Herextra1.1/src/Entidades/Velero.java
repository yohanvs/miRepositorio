//Número de mástiles para veleros.
package Entidades;

public class Velero extends Barco {

    protected int numeroDeMastiles;
   
    public Velero() {
    }

    public Velero(int numeroDeMastiles, String matricula, int eslora, int AnioDeFabricacion) {
        super(matricula, eslora, AnioDeFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    

    
}
