import java.util.Scanner;

public class Ejer7_17 {
    public static void main (String []ars){
        Scanner sc = new Scanner (System.in);

        int[][] matriz = new int[4][3];
        System.out.println("Rellena una matriz de 4x3 y te dire el valor mas alto de cada fila: ");


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Esta es la matriz");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[] mayor = new int[4];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (mayor[i]<matriz[i][j]){
                    mayor[i] = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++){
            System.out.println("El valor mas alto de la fila " + i + " es " + mayor[i]);
        }
    }
}
