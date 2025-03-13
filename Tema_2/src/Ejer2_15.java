import java.util.Scanner;

public class Ejer2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del artiuclo, su precio y su descuento: ");
        String art = sc.nextLine();
        float orig = sc.nextFloat();
        float desc = sc.nextFloat();

        desc = orig * (100-desc)/100;
        System.out.println(art + "\nAntes: " + orig + " EUR\nAhora: " + desc + "EUR");

    }
}
