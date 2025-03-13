import java.util.Scanner;

public class Ejer4_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero y te dire cuantos digitos tiene: ");

        long n = sc.nextInt();
        int i = 0;

        if (n==0){
            System.out.println("El numero tiene 1 digito");
        }else{
            while (n != 0) {
                n = n/10;
                i++;
            }
            System.out.println("El numero tiene " + i + " digitos");
        }
    }
}