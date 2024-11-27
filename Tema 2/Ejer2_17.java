import java.util.Scanner;

public class Ejer2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad y te dire si eres mayor o menor de edad: ");
        int n = sc.nextInt();

        System.out.println(n >= 18);
    }
}
