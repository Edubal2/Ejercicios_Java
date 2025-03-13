import java.util.Scanner;

public class Ejer1 {

    public static int[][] rellenar(int N, int M) {
        int[][] array = new int[N][M];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100)-50;
            }
        }
        return array;
    }

    public static void mostrar(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] calcular(int[][] array) {
        int[] calculos = new int[(array.length*array[0].length)+4];
        calculos[3] = 4;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > calculos[1]) calculos[1] = array[i][j];
                if(array[i][j] < calculos[2]) calculos[2] = array[i][j];
                if(array[i][j] >= 0) {
                    calculos[0] ++;
                    calculos[calculos[3]] = array[i][j];
                    calculos[3]++;
                }
            }
        }
        return calculos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = rellenar(sc.nextInt(), sc.nextInt());
        mostrar(array);
        int[] calculos = calcular(array);

        System.out.println("numero  maximo "+calculos[1]);
        System.out.println("numero  minimo "+calculos[2]);
        System.out.println("numeor valores positivos "+calculos[0]);
        for (int i = 4; i < calculos[3]; i++) {
            System.out.println(i-3 +". " + calculos[i]);
        }
    }
}
