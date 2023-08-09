package eggejercicios;

import java.util.Scanner;

public class EggEjercicio13 {
public static void main(String[] args){
        
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            //* * * *
            //*     *
            //*     *
            //* * * *
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el tamaño:");
            
            int n = leer.nextInt();
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == 0 || i == n || j == 0 || j == n){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }            
    }
}

