public class Ejer7_6 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Tenemos esta matriz y queremos intercambiar la ultima fila por la primera");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] cambiada = new int[matriz.length][matriz[0].length];
        int k = matriz.length-1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cambiada[i][j] = matriz[k][j];
            }
            k--;
        }
        System.out.println();

        for (int i = 0; i < cambiada.length; i++) {
            for (int j = 0; j < cambiada[i].length; j++) {
                System.out.print(cambiada[i][j] + " ");
            }
            System.out.println();
        }

    }
}
