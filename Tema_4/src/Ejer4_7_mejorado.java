import java.util.Scanner;
public class Ejer4_7_mejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j=10;
        System.out.print("A continuacion vas a introducir 10 numeros y te voy a decir si son positivos o negativos\nDeseas cambiar la cantidad de numeros S/N: ");

        char v = sc.next().charAt(0);
        if (v == 'S' || v == 's') {
            System.out.print("Introduce la cantidad de numeros nueva: ");
            j = sc.nextInt();
        }
        System.out.println("Introduce los numeros: ");


        int n[] = new int[j];
        boolean m[] = new boolean[j];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            m[i] = true;
            if (n[i] < 0){
                m[i]=false;
            }
        }


        int positivo = 0, negativo = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("\n"+(i+1) + ". El numero " + n[i]);
            if (m[i] == true) {
                System.out.print(" es positivo ");
                positivo++;
            }else {
                System.out.print(" es negativo ");
                negativo++;
            }
        }
        System.out.println("\n\nHay " + negativo + " numeros negativos y " + positivo + " numeros positivos") ;
    }
}
