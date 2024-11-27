import java.util.Scanner;

public class Ejer1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String d2 = sc.next().trim();
        String d1 = sc.nextLine().trim();
        String c2 = sc.next().trim();
        String c1 = sc.nextLine().trim();
        String b2 = sc.next().trim();
        String b1 = sc.nextLine().trim();
        String a2 = sc.next().trim();
        String a1 = sc.nextLine().trim();

        System.out.println(a1 + " " + a2 + "\n" + b1 + " " + b2 + "\n" + c1 + " " + c2 + "\n" + d1 + " " + d2);

    }
}
