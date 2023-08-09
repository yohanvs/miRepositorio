package entidades.electrodomesticos;
//public class Hotel1 extends Hotel

import java.util.Scanner;

public class Lavadora extends Electrodomesticos {

    Scanner scanner = new Scanner(System.in);

    protected Integer carga;

    public Lavadora(int carga, Double precio, String color, Double consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
        super();
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        /*
        Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
         */
        crearElectrodomestico();

        System.out.println("Que carga tiene la lavadora?");

        carga = scanner.nextInt();

    }

    public void precioFinal1() {

        precioFinal();

        if (carga > 30) {
            precio += 500;
            
        } 
    }

    @Override
    public String toString() {
        return "Lavadora" + " [carga= " + carga + "kg" + "| color= " + color + "| consumo= " + "(" + consumo + ")" + "| peso= " + peso + "kg" +" Precio= "+precio+ ']';
    }

}
