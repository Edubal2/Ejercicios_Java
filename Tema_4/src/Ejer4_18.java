import java.util.Scanner;

public class Ejer4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numeor y te dire si es primo: ");
        int n = sc.nextInt();
        boolean elPrimo = true ;
        if (n <= 1) {
            elPrimo = false;
        }else {
            for (int i = 2; i < Math.sqrt(n); i++){
                if (n % i == 0){
                    elPrimo = false;
                }
            }
        }

        if (elPrimo == true){
            System.out.println("El numero " + n + " es primo");
        }else {
            System.out.println("El numero " + n + " no es primo");
        }
    }
}
