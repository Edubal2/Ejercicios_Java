import java.util.Scanner;

public class Ejer4_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        int num = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();

        for (int i = num; i <= num2; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*"+j+"="+i*j);
            }
            System.out.println("--------------------");
        }
    }
}
