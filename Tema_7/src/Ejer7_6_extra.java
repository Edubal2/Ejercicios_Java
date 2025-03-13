import java.util.Scanner;

public class Ejer7_6_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Tenemos esta matriz y queremos intercambiar la ultima fila por la primera");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

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


        int[][] cambiada = new int[copia.length][copia[0].length];
        int k = copia.length-1;

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                cambiada[i][j] = copia[k][j];
            }
            k--;
        }
        System.out.println();

        for (int i = 0; i < cambiada.length; i++) {
            for (int j = 0; j < cambiada[i].length; j++) {
                System.out.print(cambiada[i][j] + " ");
            }
            System.out.println();
        }

    }
}
