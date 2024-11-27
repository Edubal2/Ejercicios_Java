import java.util.Scanner;

public class Ejer2_7 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de autobuses de la primera empresa, el de la segunda empresa y la capacidad de cada autobus en ese orden: ");
        int A  = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int T = (A + B) * N;
        System.out.println("La capacidad total de pasageros es de: " + T);
    }
}
