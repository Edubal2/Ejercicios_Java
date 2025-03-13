import java.util.Random;
import java.util.Scanner;
public class Ejer5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecret = random.nextInt(1, 101);
        int numeroIntroduit = 0, intentos=0;


        while (true) {
            System.out.println("Endevina el número entre 1 i 100: ");
            numeroIntroduit = scanner.nextInt();
            intentos++;
            if (numeroSecret > numeroIntroduit) {
                System.out.println("El numero es mayor");
            }
            else if (numeroSecret < numeroIntroduit) {
                System.out.println("El numero es menor");
            }

            if(numeroSecret == numeroIntroduit) break;
        }
        System.out.println("Felicitats! L'has endevinat. en "+intentos+" intents");
    }
}