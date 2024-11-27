import java.util.Scanner;

public class Ejer3_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float n;

        do {
            System.out.println("Introduce una nota:");
            n = sc.nextFloat();

            if (n < 5) {
                System.out.println("INSUFICIENT");
            } else if (n >= 5 && n < 6) {
                System.out.println("SUFICIENT");
            } else if (n >= 6 && n < 7) {
                System.out.println("BE");
            } else if (n >= 7 && n < 8.5) {
                System.out.println("NOTABLE");
            } else if (n >= 8.5 && n < 10) {
                System.out.println("EXCEL·LENT");
            } else if (n == 10) {
                System.out.println("MATRICULA");
            } else {
                System.out.println("Nota no válida.");
            }
        } while (n != 10);
    }
}
