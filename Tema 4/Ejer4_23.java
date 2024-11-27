import java.util.Scanner;

public class Ejer4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero para la secunecia y la cantidad d evecces que quires que se repita: ");
        int num = sc.nextInt();
        int rep = sc.nextInt();
        int u,d,newnum;

        for (int i = 1; i <= rep; i++) {
            u = num%10;
            d = num/10;
            newnum =d+(u*6);
            System.out.println(num+" =>     "+d+"   +  "+u+"*6    = "+newnum);
            num = newnum;
        }
    }
}



