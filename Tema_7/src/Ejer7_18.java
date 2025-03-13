import java.sql.SQLOutput;

public class Ejer7_18 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6, 7},
        };

        int mayor = 0, fila = 0;

        System.out.println("Teniendo la siguiente matriz encuantra su fila mas larga y muestra su tamaño");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length > mayor) {
                mayor = matriz.length;
                fila = i;
            }
        }

        System.out.println("La fila " + fila + " es la mas larga");
        System.out.println("Y su tamaño es de " + mayor);
    }
}
