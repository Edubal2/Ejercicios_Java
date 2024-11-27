import java.util.Scanner;

public class Ejer1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Como te llamas?: ");
        String Nombre = sc.nextLine();

        System.out.print("¿Cuantos años tienes?: ");
        Integer años = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Donde vives?: ");
        String vives = sc.nextLine();

        System.out.print("¿Cual es tu sueldo mensual?: ");
        Float sueldo = sc.nextFloat();
        sc.nextLine();

        System.out.print("¿Cual es tu profesión?: ");
        String prof = sc.nextLine();

        System.out.println("\nFicha personal\nNombre: " + Nombre + "\nLocalidad: " +vives + "\nSueldo: " + sueldo+ "\nProfession: " + prof );

    }
}
