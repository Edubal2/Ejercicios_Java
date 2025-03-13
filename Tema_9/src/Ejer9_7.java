import java.util.Scanner;

public class Ejer9_7 {
    public static void main(String[] args) {
        System.out.println(pideNumero());
    }

    public static int pideNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        int numero = sc.nextInt();
        return numero;
    }
}
