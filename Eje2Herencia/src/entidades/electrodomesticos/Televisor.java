package entidades.electrodomesticos;

import java.util.Scanner;

public class Televisor extends Electrodomesticos {

    protected Integer resolucion;
    protected Boolean tdt= false;

    Scanner scanner = new Scanner(System.in);

    public Televisor(Integer resolucion, Boolean tdt, Double precio, String color, Double consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor() {
        super();
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {

        crearElectrodomestico();

        System.out.println("Cuanta resolución tiene el televisor?");
        resolucion = scanner.nextInt();

        System.out.println("Incluye tdt?(s/n)");

        String confirmacion = scanner.next();
        if (confirmacion.equals("s")) {
            tdt = true;
        } else {
            tdt = false;
        }
    }

    public void precioFinal1() {

        precioFinal();

        if (resolucion > 40) {
            precio += (0.30 * precio);
        }

        if (tdt = true) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor[" + "resolucion=" + resolucion + "pulgadas" + "| tdt=" + tdt + "| color= " + color + "| consumo= " + "(" + consumo + ")" + "| peso= " + peso + "kg" +" Precio= "+precio+ ']';
    }

}
