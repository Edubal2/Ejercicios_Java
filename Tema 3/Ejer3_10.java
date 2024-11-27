import java.util.Scanner;
public class Ejer3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de mensages");

        int mensages = sc.nextInt();

        if (mensages == 0){
            System.out.println("You don't have unread messages");
        }else if (mensages == 1){
            System.out.println("You have one message");
        }else if (mensages >= 2 && mensages <= 98){
            System.out.println("You have " + mensages + " messages");
        }else if (mensages >= 99){
            System.out.println("You have 99+ messages");
        }
    }
}
