package Extra;

import java.util.Scanner;

public class Ejer6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero para indicar la longitud de un array: ");

        int length = sc.nextInt();
        int[] array = new int[length];//la array es de la distancia elegida
        int[] rotada = new int[length];

        System.out.println("Introduce un numero para cada posicion del array: ");

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Introduce un numero para rotar la array hacia la derecha ese numero de veces: ");

        int n = sc.nextInt();
        int pos = length - n; //asi se calcula el punto de comienzo de la array rotada

        for (int i = 0; i < length; i++) {
            rotada[i] = array[pos];
            pos++;
            if (pos == length) { pos = 0;} //cuando la rotada llega a la maxima longitud la ponemos a 0 para que pueda seguir
        }

        for (int i = 0; i < length; i++) {
            System.out.print(rotada[i] + " ");
        }
    }
}
