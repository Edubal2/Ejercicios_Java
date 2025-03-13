import java.util.Scanner;

public class Ejer5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean parell=false;
        int n=1;

        while(true){
            n = sc.nextInt();
            if(n==0)break;
            if(n % 2 == 0){
                parell = true;
            }
        }

        if(parell==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
