package ruletarusa.Entidades;

import java.util.Random;

public class RevolverAgua {

    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {

        posicionAgua = new Random().nextInt(6) + 1;
        posicionActual = new Random().nextInt(6) + 1;

    }

    public boolean mojar() {

        return posicionActual == posicionAgua;

    }

    public void siguienteChorro() {

        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
}
