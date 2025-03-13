public class Ejer7_8 {
    public static void main(String[] args) {
        int[][] matriz = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        int max = matriz[0][0];
        int maxX = 0, maxY = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxY = i;
                    maxX = j;

                }
            }
        }
        System.out.println("Valor máximo: " + max + " en la posicion [" + maxX + "][" + maxY + "]");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == maxX && j == maxY) {
                    System.out.print("[" + matriz[i][j] + "]");
                }else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
