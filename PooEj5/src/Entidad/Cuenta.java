package Entidad;

import java.util.Scanner;

public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    
    private int numeroCuenta;
    private long DNI;
    private int SaldoActual;
    
    public Cuenta(int numeroCuenta, long DNI, int SaldoActual){
        
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;     
    }       

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
    public void IngresarSaldo(){
         int Ingreso = leer.nextInt();
        SaldoActual = SaldoActual + Ingreso;
    }
    public void RetirarSaldo(){
        int Retirar = leer.nextInt();
        if(Retirar < SaldoActual){
        
            SaldoActual = SaldoActual - Retirar;
        }else{
            System.out.println("Saldo Insuficiente(pobre).");
        }   
    }
}
