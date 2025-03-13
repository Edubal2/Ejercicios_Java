import java.util.Scanner;

public class Ejer4_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int positivos = 0, negativos = 0;
        int n=1;
        while(n != 0){
            n = sc.nextInt();
            if (n < 0){
                negativos++;
            }else if (n >= 0){
                positivos++;
            }
        }


        if (negativos>0){
            System.out.println("Hay almenos un numero negativo");
        }else {
            System.out.println("No hay numeros negativos");
        }
        System.out.println("Hay " + negativos + " numeros negativos y " + positivos + " numeros positivos") ;
    }
}