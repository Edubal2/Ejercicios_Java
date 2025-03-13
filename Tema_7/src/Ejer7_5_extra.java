import java.util.Scanner;

public class Ejer7_5_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                {3, 5, 1},
                {2, 4, 6},
                {8, 7, 9}
        };

        System.out.println("Tenemos esta matriz y vamos a sumar los valores de cada fila:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

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

        // Calcular la suma de las filas
        int[] sumaFila = new int[copia.length];

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                sumaFila[i] += copia[i][j];
            }
        }

        // Imprimir los resultados
        System.out.println();
        for (int i = 0; i < sumaFila.length; i++) {
            System.out.println("La suma de la fila " + i + " es " + sumaFila[i]);
        }
    }
}
