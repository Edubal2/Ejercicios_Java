import java.util.Scanner;

public class Ejer3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el día y mes del año en este formato DD MM: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();

        if ((mes == 12 && dia >= 21) || (mes == 1) || (mes == 2) || (mes >= 3 && dia <= 20)) {
            System.out.println("Norte: Invierno\nSur: Verano");
        } else if ((mes == 3 && dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 20)) {
            System.out.println("Norte: Primavera\nSur: Otoño");
        } else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia <= 22)) {
            System.out.println("Norte: Verano\nSur: Invierno");
        } else if ((mes == 9 && dia >= 23) || (mes == 10) || (mes == 11) || (mes == 12 && dia <= 20)) {
            System.out.println("Norte: Otoño\nSur: Primavera");
        } else {
            System.out.println("Has introducido una fecha que no existe");
        }

        sc.close();
    }
}

