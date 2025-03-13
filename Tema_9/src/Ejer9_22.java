import java.util.Scanner;

public class Ejer9_22 {
    public static int[][] crearArray(int a){ // Rellenar la arrayy
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int[][] array  = crearArray(sc.nextInt()); // Definir el tamaño de la array y llamar al metodo a la vez

        for (int i = 0; i < array.length; i++) { // imprimir la array
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
