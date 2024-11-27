import java.util.Scanner;

public class Ejer3_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a) introduce un numero ");
        int val = sc.nextInt();

        if (val == 10) {
            System.out.println("val == 10");
        } else if (val >= 20 && val < 50) {
            System.out.println("20 <= val < 50");
        } else {
            if (val < 20) {
                System.out.println("val < 20");} else {
                System.out.println("val >= 50");
            }
        }


        int i = 1, j = 2;

        System.out.println("1.\nif i < j {   \n     String a = \"Hello\";\n}");
        System.out.println("2.\nif (i < j) : \n     String a = \"Hello\";\n}");
        System.out.println("3.\nif (i < j) { \n     String a = \"Hello\";\n}");
        System.out.println("4.\nif {i < j} ( \n     String a = \"Hello\";\n)");
        System.out.println("5.\nif [i < j]  \n     String a = \"Hello\";\n");

        System.out.print("elije la sentancia: ");
        int numero = sc.nextInt();

        switch (numero){

            case 1:
                System.out.println("Incorrecto");
                break;

            case 2:
                System.out.println("Incorrecto");
                break;
            case 3:
                System.out.println("Correcto");

                if (j > i) {
                    String a = "Hello";
                }
                break;

            case 4:
                System.out.println("Incorrecto");
                break;

            case 5:
                System.out.println("Incorrecto");
                break;
        }
    }
}
