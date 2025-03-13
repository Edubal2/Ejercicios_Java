import java.util.Scanner;

public class Ejer9_28 {

    public static int[][] limit(int[][] array,int L){
        int[][] array2 = array;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > L){
                    array2[i][j] = L;
                }else {
                    array2[i][j] = array[i][j];
                }

            }
        }
        return array2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Esta es nuestra matriz: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nIntroduce un numero L que actuara de limite cambiandose por los numeros mayores a el: ");
        int L = sc.nextInt();

        int[][] array2 = limit(array, L);

        System.out.println("El limite cambiado es: ");
        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
