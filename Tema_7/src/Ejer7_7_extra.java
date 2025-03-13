import java.util.Scanner;

public class Ejer7_7_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                {5, 12, 7},
                {4, 8, 15},
                {9, 3, 10}
        };

        int valorBuscado = 8;
        boolean encontrado = false;
        int valorEncontrado = 0;

        System.out.println("Tenemos esta matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Y queremos saber cuantas veces se encuentra el valor " + valorBuscado + " en ella");

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

        System.out.print("¿Quieres cambiar el valor buscado? (S/N): ");
        char cambio2 = sc.next().charAt(0);

        if (cambio2 == 'S' || cambio2 == 's') {
            System.out.print("Introduce el nuevo valor buscado: ");
            valorBuscado = sc.nextInt();
        }

        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j] == valorBuscado) {
                    encontrado = true;
                    valorEncontrado++;
                    System.out.println("Value found at: [" + i + "][" + j + "]");

                }
            }
        }
        switch (valorEncontrado) {
            case 0:
                System.out.println("El valor no esta en la matriz");
                break;
            case 1:
                System.out.println("El valor esta en la matriz 1 vez");
                break;
            default:
                System.out.println("El valor esta en la matriz " + valorEncontrado +" veces");
        }
    }
}
