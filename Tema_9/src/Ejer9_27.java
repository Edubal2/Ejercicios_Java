import java.util.Scanner;

public class Ejer9_27 {

    public static int[][] crearArray(int a){ // Rellenar la arrayy
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

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

    public static void imprimir(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la array cuadrada");
        int a = sc.nextInt();
        System.out.println("Introduce la cantidad de numeros que quieres mostrar de la array");
        int N = sc.nextInt();

     imprimir(cambiar(crearArray(a), N));




    }
}
