import java.util.Scanner;

public class Ejer5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de estudiantes: ");
        int e = sc.nextInt();
        System.out.print("Introduce el numero de notas: ");
        int n = sc.nextInt();
        float media = 0.0f;
        boolean error = false;

            for (int i = 1; i <= e; i++) {
                String nombre = sc.next();
                for (int j = 1; j <= n; j++) {
                    float Notas = sc.nextFloat();
                    media += Notas;
                    if (Notas < 0) {
                        error = true;
                    }
                }
                if (error) {
                    System.out.println("Error en el alumno " + nombre);
                    break;
                } else {
                    System.out.println(nombre + ": " + media / n);
                    media = 0.0f;
                }

        }
    }
}
