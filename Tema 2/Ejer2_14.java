import java.util.Scanner;

public class Ejer2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ancho, alto y rpofundo de la caja en ese orden: ");
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();

        int c = (h + w + d) * 4;
        System.out.println("La cantidad de cinta que necesitamos es de: " + c);
        
    }
}
