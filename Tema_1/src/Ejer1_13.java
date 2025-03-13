import java.util.Scanner;

public class Ejer1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la entrevista de cocina, rellena el siguiente formulario porfavor:");

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        Integer edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce tu nivel de estudios: ");
        String nivel = sc.nextLine();

        System.out.print("Introduce cuantos años de eperinecia tienes: ");
        Integer años = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce tu tipo de cocina: ");
        String tipo = sc.next();

        System.out.println("El formulario de " + nombre + " se ha completado. Te contactaremos si necesitamos un chef de cocina " + tipo);
    }
}
