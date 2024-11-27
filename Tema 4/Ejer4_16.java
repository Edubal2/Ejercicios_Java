import java.util.Scanner;

public class Ejer4_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero y te dire esa cantidad de numeros de la secencia fibonacci: ");
        int n = sc.nextInt();
        int a = 0, b =1, c;


        for(int i = 0; i < n; i++){
            System.out.print(a + ", ");
            c = a;
            a = a + b;
            b = c;
        }

        /*for(int i = 0; i < n; i++){
            System.out.println (a + " = a  " + b + " = b  " + c + " = c ");

            c = a;
            a = a + b;
            b = c;
        }*/

    }
}
