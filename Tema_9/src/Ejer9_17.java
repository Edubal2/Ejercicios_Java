import java.util.Scanner;

public class Ejer9_17 {

    public static int menor(int a, int b) {
        if (a < b){
            return a;
        }else {
            return b;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(menor(a,b));
    }
}
