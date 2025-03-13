package Extra;

import java.util.Scanner;

public class Ejer6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud el array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        int[] recortada = new int[length];

        System.out.println("Introduce el valor de la array: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int j = 0;
        for ( int i = 0; i < length;i++) {
            if (i == length -1 || array[i] != array[i + 1]){
                    recortada[j++] = array[i];
            }
        }

        for ( int i = 0; i <  j; i++) {
            System.out.print(recortada[i] + " ");
        }
    }
}
