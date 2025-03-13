import java.util.Scanner;

public class Ejer7_8_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        System.out.print("¿Quieres cambiar los valores de la matriz? (S/N): ");
        char cambio = sc.next().charAt(0);

        int[][] copia; // Declaración de la matriz copia

        if (cambio == 'S' || cambio == 's') {
            System.out.print("Introduce el número de filas y columnas: ");
            int fila = sc.nextInt();
            int columna = sc.nextInt();

            copia = new int[fila][columna];

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print("[" + i + "][" + j + "]: ");
                    copia[i][j] = sc.nextInt();
                }
            }
        } else {
            copia = matriz; // Asignación directa si no se realiza un cambio
        }

        int max = copia[0][0];
        int maxX = 0, maxY = 0;

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j] > max) {
                    max = matriz[i][j];
                    maxY = i;
                    maxX = j;

                }
            }
        }
        System.out.println("Valor máximo: " + max + " en la posicion [" + maxX + "][" + maxY + "]");

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                if (i == maxX && j == maxY) {
                    System.out.print("[" + copia[i][j] + "]");
                }else {
                    System.out.print(" " + copia[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
