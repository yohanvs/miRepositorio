
package Service;

import Entidades.Circulo;
import Entidades.Circulo.calcular;

public class ServiceCirculo implements calcular {
    Circulo c1 = new Circulo();
    @Override
    public void calcularCirculo(Circulo circulo){
        
        
        double area = Math.PI *(c1.getRadio()*c1.getRadio());
        double perimetro = Math.PI * c1.getDiametro();
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}
