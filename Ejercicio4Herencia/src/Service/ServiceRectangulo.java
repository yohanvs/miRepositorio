package Service;

import Entidades.Rectangulo;
import Entidades.Rectangulo.calcular;

public class ServiceRectangulo implements calcular{
    @Override
    public void calcularRectangulo(Rectangulo rectangulo){
        Rectangulo r1 = new Rectangulo();
        double area = r1.getBase() * r1.getAltura();
        double perimetro = (r1.getAltura()+r1.getBase())*2;
        System.out.println("El area del rectangulo e: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
