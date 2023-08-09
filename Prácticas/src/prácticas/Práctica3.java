package prácticas;

public class Práctica3 {

    public static void main(String[] args) {
        /*practicar bucles
        System.out.println("Bucle for");
        
        for (int i0 = 0; i0 <= 10; i0++) {
            System.out.print(i0+", ");
        }
        
        System.out.println("");
        
        System.out.println("Bucle while");
        
        int i1 = 1;
        while(i1 < 10){
            System.out.print(i1+", ");
            i1+=2;
        }
        
        System.out.println("");
        
        System.out.println("Bucle do-while");
        int i2 = 1000;
        do {
            
            System.out.print(i2+", ");
            i2-=200;
            
        } while (i2 >= 0);
         */

 /* int i = 0, j = 99; 

        System.out.println("Este ciclo es con for: ");

        for (i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");               
            } else {
                System.out.print(i + ",");
                System.out.println(j);
            }
            j--;
        }
        
        i = 1;
        j = 99;
        
        System.out.println("");

        System.out.println("Este ciclo es con while");
        
        while(i <= 5){
             if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.println(j);
            }
             i++;
             j--;
        }
        
        i=1;
        j=99;
        
        System.out.println("");
        
        System.out.println("Este ciclo es con do-while");
        
        do {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.println(j);
            }
             i++;
             j--;
        } while (i<=5); */
 
 
 
 
 
 
        //Realizar un programa que imprima por pantalla la sucesión fibonacci utilizando las 
        //estructuras repetitivas "for", "while", "do-while". Ejemplo: (0,1,1,2,3,5,8,13,21,34)
        int a = 0, b = 1, c = 0;

        for (int i = 0; i < 10; i++) {
            if(a <34){
                System.out.print(a + ",");
            }else{
                System.out.print(a);
            }

            c = a + b;
            a = b;
            b = c;
        }
        a = 0;
        b = 1;
        c = 0;
        
        System.out.println("");
        
        while (a <= 34) {
            if(a < 34){
                System.out.print(a + ",");
            }else{
                System.out.print(a);
            }

            c = a + b;
            a = b;
            b = c;
        }
        
        System.out.println("");
        
        a = 0;
        b = 1;
        c = 0;
        
        do {
             if(a < 34){
                System.out.print(a + ",");
            }else{
                System.out.print(a);
            }

            c = a + b;
            a = b;
            b = c;
        } while (a <=34);
        
        System.out.println("");
    }

}
