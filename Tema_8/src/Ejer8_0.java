import java.util.Scanner;

public class Ejer8_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra y te la separo por caracteres: ");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

    }
}
