import java.util.Scanner;
public class Ejer4_4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int M = 0, N = 0;

        System.out.print("Te voy a mostrar todos los numeros enteros comprendidos entre los numeros N Y M que va a elegir a continuación\nIntroduce el primer numero N: ");
        M = sc.nextInt();

        System.out.print("Introduce el ultimo numero M: ");
        N = sc.nextInt();

        for (; M <= N ;M++ ){
            System.out.print(M + " ");
        }
        sc.close();
    }
}
