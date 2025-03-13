public class Ejer7_2 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[] elem = new int[matriz.length];
        int filas = 0;



        for (int i = 0; i < matriz.length; i++) {
            filas++;
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                elem[i]++;
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\n\nLa matriz tiene " + filas + " filas");
        for (int i = 0; i < elem.length; i++) {
            System.out.println("La fila " + i + " tiene " + elem[i] + " elementos");
        }
    }

}
