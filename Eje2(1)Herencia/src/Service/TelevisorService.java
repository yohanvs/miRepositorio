package Service;

import Entidades.Electrodomestico;
import Entidades.Televisor;

public class TelevisorService extends ElectrodomesticoService {

    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public Televisor crearTelevisor() {
        Electrodomestico electro = crearElectrodomestico();
        Televisor tele = new Televisor();
        tele.setColor(electro.getColor());
        tele.setConsumoEnergetico(electro.getConsumoEnergetico());
        tele.setPeso(electro.getPeso());
        tele.setPrecio(electro.getPrecio());
        System.out.println("Ingrese la cantidad de pulgadas");
        int pulgadas = scanner.nextInt();
        tele.setPulgadas(pulgadas);
        System.out.println("Tiene sintonizador tdt? S/N");
        if (scanner.next().charAt(0) == 'S') {
            tele.setTdt(true);
        } else {
            tele.setTdt(false);
        }       
        return tele;
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    public void precioFinal(Televisor tele) {
        super.precioFinal(tele);
        if (tele.getPulgadas() > 40) {
            tele.setPrecio((int)(tele.getPrecio() * 1.3));
        }
        if (tele.isTdt()) {
            tele.setPrecio(tele.getPrecio() + 500);
        }
        System.out.println("El precio del televisor es "+tele.getPrecio());
    }

}
