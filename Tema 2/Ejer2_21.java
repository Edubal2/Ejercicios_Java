import java.util.Scanner;

public class Ejer2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean java = sc.nextBoolean();
        int a1 = sc.nextInt();
        boolean python = sc.nextBoolean();
        int b1 = sc.nextInt();

        System.out.println(java && a1 >= 1 || python && b1 >= 3);
        
    }
}
