import java.util.Scanner;

public class Ejer2_22_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
        int v = sc.nextInt();
        boolean dosis = false;
        System.out.println("Ingrese la dosis incial en miligramos: " + i);
        System.out.println("El incremento semanal en miligramos: " + a);
        System.out.println("Ingrese numero de semanas: " + s);
        System.out.println("Ingrese la dosis incial en miligramos: " + v);

        System.out.print("\nLas dosis planificadas son: ");

        for (int j = 1; j <= s; j++) {

            System.out.print(i + " ");
            i += a;

            if (v == i){
                dosis = true;
            }
        }

        System.out.println("\nLa dosis "+ v + "mg coincide con una de las dosis planificadas: " + dosis);
    }
}
