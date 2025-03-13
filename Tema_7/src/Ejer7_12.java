import java.util.Scanner;

public class Ejer7_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matriz = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}

    };
        boolean encontrado = false;
        int posX = 0, posY = 0;

        System.out.print("Introduce un caracter y te dire enque posicion de la matriz esta: ");
        char valor = sc.next().charAt(0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    encontrado = true;
                    posY = i;
                    posX = j;
                }
            }
        }
        if (encontrado) {
            System.out.println("El caracter " + valor + " esta en la posicion [" + posX + "][" + posY + "]");
        }else {
            System.out.println("El caracter no se encuentra en la matriz");
        }
    }
}
