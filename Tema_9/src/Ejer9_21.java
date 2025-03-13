import java.util.Scanner;

public class Ejer9_21 {
    public static int mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }else if (b > c) {
            return b;
        }else  {
            return c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres numero y te dire el mayor de los 3: ");
        System.out.println("El mayor es " + mayor(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
