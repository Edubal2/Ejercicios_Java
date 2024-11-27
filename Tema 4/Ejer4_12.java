import java.util.Scanner;

public class Ejer4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero A que voy calcular su exponente elevado a un numero B ");
        int a = 0,b = 1;
        a = sc.nextInt();
        b = sc.nextInt();
        int c=1;

        for (int i = 0; i < b; i++) {
            c = c * a;
            System.out.println(c);
        }

        System.out.println("El resultado de "+a+"^"+b+" es: " + c);
    }

}
