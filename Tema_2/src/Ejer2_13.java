import java.util.Scanner;
public class Ejer2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca 2 numero y le dire los 7 primeros de su sucesión fibonachi: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int n3 = n2 + n1;
        int n4 = n3 + n2;
        int n5 = n4 + n3;
        int n6 = n5 + n4;
        int n7 = n6 + n5;

        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7);




    }
}
