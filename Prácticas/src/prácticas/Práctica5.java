package prácticas;

import java.util.Scanner;

public class Práctica5 {

    public static void main(String[] args) {

        //Vectores 
        Scanner leer = new Scanner(System.in);

        /* int nums[] = new int[5];
        
        nums[0] = 5;
        nums[1] = 220;
        nums[2] = 8;
        nums[3] = 458;
        nums[4] = 22;
        
        System.out.println("["+nums[0]+"]");
        System.out.println("["+nums[1]+"]");
        System.out.println("["+nums[2]+"]");
        System.out.println("["+nums[3]+"]");
        System.out.println("["+nums[4]+"]");
         */
        
        /*
        int t;
        System.out.println("Ingrese el tamaño del vector");
        t = leer.nextInt();
        int nums[] = new int[t];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese valor al vector en la posición [" +i+ "]");
            nums[i] = leer.nextInt();
            System.out.println("[" + nums[i] + "]");
        }

        System.out.println("-------------------");
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Posición en el índice [" +i+ "] valor = [" + nums[i] + "]");
        } */
        
        int fila, columna, contador = 100;
        
        System.out.print("Por favor ingrese el tamaño de la fila de la matriz:");
        fila = leer.nextInt();
        
        System.out.print("Por favor ingrese el tamaño de la columna de la matriz:");
        columna = leer.nextInt();
        
        int nums[][] = new int[fila][columna];
        
        for (int j = 0; j < fila; j++) {
            for (int i = 0; i < columna; i++) {
                nums[j][i] = contador;
                System.out.print("["+nums[j][i]+"]");
                contador++;
            }
            System.out.println("");
        }                                   
    }

}
