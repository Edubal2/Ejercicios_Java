import java.util.Scanner;

public class Ejer3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            float km = sc.nextFloat();
            float min = sc.nextFloat();

            float precio = 10 + km * 2 + min * 0.25f;
            float kmh = km / (min / 60);

            if ((km > 10) && (min >= 30)) {
                precio = precio * 0.7f;
            }

            System.out.println(precio + "€\n" + kmh + "km/h");

    }
}
