public class Ejer7_7 {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 12, 7},
                {4, 8, 15},
                {9, 3, 10}
        };

        int valorBuscado = 8;
        boolean encontrado = false;
        int valorEncontrado = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    encontrado = true;
                    valorEncontrado++;
                    System.out.println("Value found at: [" + i + "][" + j + "]");
                    System.out.println("Esta el valor en la matriz " + valorEncontrado + " veces");
                }
            }
        }

    }
}
