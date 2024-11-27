import java.util.Scanner;

public class Ejer2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 4 numeros y te dire sei estan ordenados de mayor a menor: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println(n1 < n2 && n2 < n3 && n3 < n4);
    }
}
