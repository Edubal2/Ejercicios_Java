import java.util.Scanner;

public class Ejer3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Benvingut a l'enquesta.\nConeixes algun framework?");
        String n = sc.nextLine();

        if (n.equals("si")) {
            System.out.println("Quin?");
            String frame = sc.nextLine();
            System.out.println("S'ha registrat la resposta: " + frame);
        }
        System.out.println("Gracies per contestar");


    }
}
