import java.util.Scanner;

public class Ejer2_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las notas de los 3 alumnos: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        float n = (n1 + n2 + n3) / 3;
        System.out.print("La media de sus notas es " + n);
    }
}
