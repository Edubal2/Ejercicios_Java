public class Ejer7_11 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int[][] transpuesta = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println();
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < transpuesta.length; i++){
            for (int j = 0; j < transpuesta[i].length; j++){
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }


    }
}
