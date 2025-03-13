import java.util.Scanner;

public class Ejer7_16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int[][] matriz = new int[3][3];
        int[][] rotada = new int[3][3];

        System.out.println("Introduzca la matriz y te la voy a girar 90º: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Teniendo la matriz: ");
        int k = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                rotada[i][k] = matriz[j][i];
                k--;
            }
            k=2;
            System.out.println();
        }
        System.out.println("Esta es su rotada: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
