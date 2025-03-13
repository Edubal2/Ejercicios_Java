import java.util.Scanner;
public class Ejer4_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean nota = false;
        int n=0;
        while(n != -1){
            n = sc.nextInt();
            if (n == 10){
                nota = true;
            }
        }

        if (nota == true){
            System.out.println("Hay almenos una nota con un 10");
        }
    }
}
