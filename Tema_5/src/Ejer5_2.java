import java.util.Scanner;
public class Ejer5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix números (negatiu per a parar):");
        int suma = 0;

        while(true){
            int n = scanner.nextInt();

            if(n < 0) break;
            if(n>=0){
                suma+=n;
            }
        }

        System.out.println("Suma dels números positius: " + suma);
    }
}