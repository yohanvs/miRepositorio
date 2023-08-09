package Entidad;
public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void CrearOperacion(double num1, double num2){
        
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double Suma(){
    
        return num1 + num2;
    }
    
    public double Restar(){
    
        return num1 - num2;
    }
    
    public double Multi(){
        
        if(num2 ==0){
            
            System.out.println("Error, no se puede multiplicar por 0.");
            
            return 0;
        }
       return num1 * num2;
    }
    
    public double Divi(){
        
        if(num2 == 0){
        
            System.out.println("Error, no se puede dividir entre 0.");
            
            return 0;
        
        }
    
        return num1/num2;
    }
    
    
}
