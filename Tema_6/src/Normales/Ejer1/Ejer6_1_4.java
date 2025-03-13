package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[20];
        int sumapos=0, sumaneg=0;

        for (int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (n[i]<0){
                sumaneg+=n[i];
            }else if (n[i]>=0){
                sumapos+=n[i];
            }
        }
        System.out.println("La suma de los positivos es: "+sumapos);
        System.out.println("La suma de los negativos es: "+sumaneg);
    }
}
