
package EntidadRaza;

public class EntidadRaza {
    
   
    public String raza;

    public EntidadRaza() {
    }

    public EntidadRaza(String raza) {
        
        this.raza = raza;
    }

   

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "EntidadRaza{" + " raza=" + raza + '}';
    }
    
    
    
    
    
}
