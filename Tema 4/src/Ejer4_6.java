import java.util.Scanner;

public class Ejer4_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean negativo = false;
        int n = 0;
        for (int i = 0; i <=10; i++){
           n = sc.nextInt();
           if (n < 0){
               negativo = true;
           }
        }

        if (negativo == true){
            System.out.println("Hay almenos un numero negativo");
        }else {
           System.out.println("No hay numeros negativos");
        }
    }
}