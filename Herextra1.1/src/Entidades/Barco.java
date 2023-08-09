package Entidades;

public class Barco{

    protected String matricula;
    protected int eslora;
    protected int AnioDeFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int AnioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.AnioDeFabricacion = AnioDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioDeFabricacion() {
        return AnioDeFabricacion;
    }

    public void setAnioDeFabricacion(int AnioDeFabricacion) {
        this.AnioDeFabricacion = AnioDeFabricacion;
    }

    

    
}
