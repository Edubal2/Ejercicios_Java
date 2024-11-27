import java.util.Scanner;

public class Ejer2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora que es: ");
        int h = sc.nextInt();
        int m = sc.nextInt();

        int t = 1440 - (h * 60 + m);

        System.out.println("Quedan " + t + " minutos para medianoche");
    }
}
