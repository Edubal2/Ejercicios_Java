import java.util.Scanner;

public class Ejer2_22_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int a = sc.nextInt();   
        int s = sc.nextInt();
        int v = sc.nextInt();

        System.out.println("Ingrese la dosis incial en miligramos: " + i);
        System.out.println("El incremento semanal en miligramos: " + a);
        System.out.println("Ingrese numero de semanas: " + s);
        System.out.println("Ingrese la dosis incial en miligramos: " + v);

        System.out.println("\nDosis planificadas: " + i + ", " + (i + a) + ", " + (i + a*2) + ", " + (i +a*3));
        System.out.print("La dosis " + v + " mg coincide con una de las dosis planificadas: ");
        System.out.print(v == i || v == i *2 || v == i*3 || v == i*4);
    }
}


