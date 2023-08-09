
package Service;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

public class LavadoraService extends ElectrodomesticoService {
    
    public Lavadora crearLavadora(){
        Electrodomestico electro = crearElectrodomestico();
        Lavadora lavadora = new Lavadora();
        lavadora.setColor(electro.getColor());
        lavadora.setConsumoEnergetico(electro.getConsumoEnergetico());
        lavadora.setPeso(electro.getPeso());
        lavadora.setPrecio(electro.getPrecio());
        System.out.println("Ingrese carga de lavadora");
        int carga = scanner.nextInt();
        lavadora.setCarga(carga);  
        return lavadora;
    }
    
    public void precioFinal(Lavadora lavadora){
        super.precioFinal(lavadora);
        if (lavadora.getCarga() > 30) {
            lavadora.setPeso(lavadora.getPrecio()+500);
        }
        System.out.println("El precio de la lavadora es "+lavadora.getPrecio());
    
    }

    
    
}
