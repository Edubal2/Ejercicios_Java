import java.util.Scanner;

public class Ejer7_15 {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Rellena una matriz cuadrada 3x3 y te dire si es una matriz identidad o no");
        boolean identidad = true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Poscion ["+ i +"]["+ j +"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("La matriz: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] != 0 ){
                    if(matriz[0][0] != 1 || matriz[1][1] != 1 || matriz[2][2] != 1){
                        identidad = false;
                    }
                }
            }
            System.out.println();
        }

        if (identidad){
            System.out.println("La matriz es una matriz Identidad");
        }else{
            System.out.println("La matriz no es una matriz Identidad");
        }



    }
}
