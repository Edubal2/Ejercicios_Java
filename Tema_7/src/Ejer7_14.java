import java.util.Scanner;

public class Ejer7_14 {
    public static void main (String []args ){
        Scanner sc = new Scanner (System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] AB = new int[2][2];

        System.out.print("Vamos a multiplicar 2 matrices 2x2 desea rellenarlas manualmente o aleatoriamente? (M/A): ");

        char valor = sc.next().charAt(0);

        while (valor != 'M' && valor != 'A' && valor != 'm' && valor != 'a') {
            System.out.println("\nValor invalido");
            System.out.print("Vuelve a introducirlo: ");
            valor = sc.next().charAt(0);
        }

        if (valor == 'M' || valor == 'm') {
            System.out.println("\nPrimera matriz");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + i + "][" + j + "]: ");
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("\nSegunda matriz");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + i + "][" + j + "]: ");
                    B[i][j] = sc.nextInt();
                }
            }

        }else if (valor == 'A' || valor == 'a') {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    A[i][j] = (int) (Math.random() * 10);
                    B[i][j] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Estas son las matrices:");
        System.out.println("Primera matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Segunda matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                    AB[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
            }
        }

        System.out.println("\nEl resultado de la matriz es: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(AB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
