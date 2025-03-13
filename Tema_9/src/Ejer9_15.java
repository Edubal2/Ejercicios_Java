import java.util.Scanner;

public class Ejer9_15 {

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multiplicacion(a, b));
    }

}
