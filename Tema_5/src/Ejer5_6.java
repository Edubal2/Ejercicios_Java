import java.util.Scanner;

public class Ejer5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                if (i * j > 50) break;
                System.out.println(j + ". " + i + " * " + j + " = " + i*j );
            }
        }
    }
}
