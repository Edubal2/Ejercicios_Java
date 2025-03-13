import java.util.Scanner;

public class Ejer7_13 {
    public static void main (String[] ars){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el tamaño que quieres que tenga la matrix cuadrada de numeros aleatorios y te calculare la suma de sus columnas, filas y diagonales: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        int[] fila = new int[n];
        int[] columna = new int[n];
        int diagonalP = 0;
        int diagonalS = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("El matriz es: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int k = n-1;
        for (int i = 0; i < n; i++){
            diagonalP += matriz[i][i];
            diagonalS += matriz[i][k];
            k--;
            for (int j = 0; j < n; j++){
                fila[i] += matriz[i][j];
                columna[i] += matriz[j][i];
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.println("La suma de la columna " + i + " es " + columna[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.println("La suma de la fila " + i + " es " + fila[i] + " ");
        }
        System.out.println();

            System.out.println("La suma de la diagonal principal es " + diagonalP + " ");

        System.out.println();

            System.out.println("La suma de la diagonal secundaria es " + diagonalS + " ");


    }
}
