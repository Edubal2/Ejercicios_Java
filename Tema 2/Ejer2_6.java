import java.util.Scanner;

public class Ejer2_6 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el numero de ardillas y el numero de nueces que hay: ");
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.print(K % N);
    }
}
