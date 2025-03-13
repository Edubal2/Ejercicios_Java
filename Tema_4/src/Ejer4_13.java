import java.util.Scanner;

public class Ejer4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeroInvertido = 0;

        while (numero !=0){
            int digito = numero%10;

            numeroInvertido = numeroInvertido*10 + digito;

            numero = numero/10;
        }

        System.out.println(numeroInvertido);

    }

}
