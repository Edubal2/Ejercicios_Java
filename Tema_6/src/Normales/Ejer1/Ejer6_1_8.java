package Normales.Ejer1;

import java.util.Scanner;
import java.util.Random;

public class Ejer6_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        float[] n = new float[100];

        int igual=0;

        for (int i = 0; i < 100; i++) {
            n[i] = random.nextFloat(0, 1);
        }

        float R=0;

            System.out.print("Introduce un numero R mayor que o igual cero y menor o igual que uno: ");
            R = sc.nextFloat();


        for (int i = 0; i < 100; i++) {
            if (n[i] >= R) {
                igual++;
            }
        }

        System.out.println(igual + " Numeros son iguales o mayores a al numero R: " + R);
    }
}
