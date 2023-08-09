//Potencia en CV para barcos a motor.
package Entidades;

public class BarcoMotor extends Barco {
    private int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, int eslora, int AnioDeFabricacion) {
        super(matricula, eslora, AnioDeFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
