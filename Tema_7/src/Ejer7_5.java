public class Ejer7_5 {
    public static void main(String[] args) {

        int[][] matriz = {
                {3, 5, 1},
                {2, 4, 6},
                {8, 7, 9}
        };

        System.out.println("Tenemos esta matriz y vamos a sumar los valores de cada fila:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        // Calcular la suma de las filas
        int[] sumaFila = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila[i] += matriz[i][j];
            }
        }

        // Imprimir los resultados
        System.out.println();
        for (int i = 0; i < sumaFila.length; i++) {
            System.out.println("La suma de la fila " + i + " es " + sumaFila[i]);
        }
    }
}
