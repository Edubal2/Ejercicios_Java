import java.util.Scanner;

public class Ejer4_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nuenrmo y te dire su tabla de multiplicar: ");
        int n = sc.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
