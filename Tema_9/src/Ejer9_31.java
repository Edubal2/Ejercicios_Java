import java.util.Scanner;

public class Ejer9_31 {

    public static int[][] filterAndTransform(int[][] array, int L, int M) {
        int[][] array2 = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > L) {
                    array2[i][j] = 0;
                } else {
                    array2[i][j] = array[i][j] * M;
                }

            }
        }
        return array2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Esta es nuestra matriz: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nIntroduce un numero L que actuara de filtro cambiandose por los numeros mayores a el: ");
        int L = sc.nextInt();
        System.out.print("\nIntroduce un numero M por el cual se multiplicaran los numeros de la matriz: ");
        int M = sc.nextInt();
        int[][] array2 = filterAndTransform(array, L, M);

        System.out.println("El filtro cambiado es: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }


    }
}