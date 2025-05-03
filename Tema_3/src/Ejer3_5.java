import java.util.Scanner;

public class Ejer3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, m, s;

        // Input validation
        do {
            System.out.println("Introduce una hora con el siguiente formato HH MM SS");
            h = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();

            if (h < 0 || h > 23) {
                System.out.println("Las horas van de 0 a 23");
            }
            if (m < 0 || m > 59) {
                System.out.println("Los minutos van de 0 a 59");
            }
            if (s < 0 || s > 59) {
                System.out.println("Los segundos van de 0 a 59");
            }
        } while (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59);

        // Increment the time by one second
        s++;

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        // Display the updated time
        System.out.println("La nueva hora es " + (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s));
    }
}
