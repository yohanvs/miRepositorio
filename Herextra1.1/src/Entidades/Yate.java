//Potencia en CV y número de camarotes para yates de lujo.
package Entidades;

public class Yate extends BarcoMotor{
    
    private int numeroCamarotes;

    public Yate() {
    }

    public Yate(int numeroCamarotes, int potencia, String matricula, int eslora, int AnioDeFabricacion) {
        super(potencia, matricula, eslora, AnioDeFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
}
