import java.util.Scanner;

public class Ejer7_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
        };

        int fila, columna;

        do {
            System.out.println("Ingresa la fila que quieras mirar su contenido:");
            fila = sc.nextInt();
            System.out.println("Ingresa la columna que quieras mirar su contenido:");
            columna = sc.nextInt();

            if (fila >= matriz.length || columna >= matriz[0].length || fila < 0 || columna < 0) {
                System.out.println("Los elementos que buscas no están en la matriz. Introduce valores válidos.");
            }
        } while (fila >= matriz.length || columna >= matriz[0].length || fila < 0 || columna < 0);

        System.out.println("La posición [" + fila + "][" + columna + "] de la matriz es " + matriz[fila][columna]);
    }
}
