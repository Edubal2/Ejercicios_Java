
import java.util.Scanner;

public class Ejer4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = {'E','N','B','S','I'};
        int[] notas = new int[5];

        int n=0,j,k;

        System.out.println("Introduzca una nota entre 1 y 10(-1 para salir): ");

        while(n!=-1){
             n = sc.nextInt();
            switch(n){
                case 1,2,3,4:
                    notas[4]++;
                    break;

                case 5:
                    notas[3]++;
                    break;

                case 6:
                    notas[2]++;
                    break;

                case 7,8:
                    notas[1]++;
                    break;

                case 9,10:
                    notas[0]++;
                    break;

                case -1:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Introduce un numero entre 1 y 10");
                    break;

            }
        }
        for (j=0;j<=4;j++) {
            System.out.print("\n"+letras[j]+":");
            for (k = 0; k <notas[j]; k++) {
                System.out.print("#");
            }
        }
    }
}
