import java.util.Scanner;

public class Ejer2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 numero y te dire si estan capicua: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        System.out.println(n1 == n5 && n2 == n4);
    }

}
