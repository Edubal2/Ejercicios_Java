import java.util.Scanner;

public class Ejer2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero de 3 cifras y se lo invertiré: ");

        int n = sc.nextInt();

        int c = n/100;
        int d = (n%100)/10;
        int u = n%10;

        System.out.println(u*100+ d-10 + c);
    }
}
