import java.util.Scanner;

public class Ejer1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rellena el siguietne cuestionario apra nuestra base de datos");
        System.out.print("De que forma desea que se le trate: ");
        String trato = sc.nextLine();
        System.out.print("Cual es su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cual es su primer apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Cual es su segundo apellido: ");
        String apellido2 = sc.nextLine();

        System.out.print("\n"+ trato +" "+ apellido2 +" "+ apellido1 +", "+  nombre +"\nEl pricipal objetivo de la presente carta..." );







    }
}
