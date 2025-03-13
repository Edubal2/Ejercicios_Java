import java.util.Scanner;

public class Ejer9_26 {

    public static int[][] cambiar(int[][] array, int N) {

        int[][] array2  = new int[array.length][array.length];
        if (array.length * array.length > N ) {
            int cuenta = 0;
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = array[i][j];
                    cuenta++;
                    if (cuenta >= N) break;

                }
                if (cuenta >= N) break;
                System.out.println();
            }
            cuenta = 0;
        }

        return array2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de una array cuadrada");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println("Y el numero de numeros que deseas mostrar de esa matriz");
        int num = sc.nextInt();
        int[][] array2 = cambiar(array, num);
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
