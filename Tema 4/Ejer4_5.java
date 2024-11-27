import java.util.Scanner;
public class Ejer4_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero y te dire su factorial: ");

        long n = 1;
        n = sc.nextInt();

        long m = 1;

        for(int i = 1;i<=n;i++){
            m = m*i;
        }

        System.out.println("El factorial de " + n + " es " + m);
        sc.close();
    }
}
