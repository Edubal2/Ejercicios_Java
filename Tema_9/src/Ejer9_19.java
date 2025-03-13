import java.util.Scanner;

public class Ejer9_19 {

    public static float millas(float a) {
        float b = a * 0.621371f;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(millas(sc.nextFloat()));
    }
}
