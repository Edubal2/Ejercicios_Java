import java.util.Scanner;

public class Ejer7_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("Introduce la columna que quieres sumar de esta matriz:");

        // Imprimir la matriz en formato visual
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nColumna: ");
        int columna = sc.nextInt();

        // Validación de columna mínima
        if (columna < 0) {
            System.out.println("La columna no puede ser negativa.");
            return;
        }

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            // Verificar si la fila tiene la columna especificada
            if (columna < matriz[i].length) {
                suma += matriz[i][columna];
            }
        }

        System.out.println("La suma de la columna " + columna + " en la matriz es: " + suma);
    }
}
