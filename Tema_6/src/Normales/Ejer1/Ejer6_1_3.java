package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        int minimo=0, maximo=0;

        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        minimo = n[0];
        maximo = n[0];
        for (int i = 1; i < 10; i++) {
            if (n[i]<=minimo){
                minimo=n[i];
            }
            if (n[i]>=maximo) {
                maximo=n[i];
            }
        }
        System.out.println("El minimo es: "+ minimo);
        System.out.println("El maximo es: "+ maximo);
    }
}
