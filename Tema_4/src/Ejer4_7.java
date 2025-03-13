import java.util.Scanner;

public class Ejer4_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int n = 0;
        for (int i = 1; i <=10; i++){
            n = sc.nextInt();
            if (n < 0){
                negativos++;
            }else if (n >= 0){
                positivos++;
            }
        }

        System.out.println("Hay " + negativos + " numeros negativos y " + positivos + " numeros positivos") ;
    }
}