import java.util.Scanner;

public class Ejer4_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        while(n!=-2){
            n = sc.nextInt();
            if(n>=0){
                for (int i = 1; i <= n; i++) {
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            if(n==-1){
                System.out.println();
            }

        }
    }
}
