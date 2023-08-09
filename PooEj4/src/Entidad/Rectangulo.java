package Entidad;

public class Rectangulo {
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        
        this.base = base;
        this.altura = altura;
    
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double Superficie(){
    
        return base * altura;
    }
    
    public double Perimetro(){
    
        return (base + altura) * 2;
    }
    public void Dibujar(){  
        for(int i = 0; i < base ; i++){
            for(int j = 0; j < altura; j++){
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
}