import java.util.Scanner;

public class Ejer1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribeme una frase de 5 palabras y te las mostrare verticalmente: ");

        String a1 = scanner.next();
        String a2 = scanner.next();
        String a3 = scanner.next();
        String a4 = scanner.next();
        String a5 = scanner.next();

        System.out.println("Las palabras son: \n" + a1 + "\n" +  a2 + "\n" + a3 + "\n" + a4 + "\n" + a5);
    }
}