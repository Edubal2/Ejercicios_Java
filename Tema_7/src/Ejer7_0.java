import java.util.Scanner;

public class Ejer7_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas y columnas: ");
        int f = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[f][c];

        System.out.print("Ingresa el valor de las filas y columnas: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < f; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
