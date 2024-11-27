import java.util.Scanner;
public class Ejer4_6_mejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j=10;
        System.out.print("A continuacion vas a introducir 10 numeros y te voy a decir si son positivos o negativos\nDeseas cambiar la cantidad de numeros S/N: ");

        char v = sc.next().charAt(0);
        if (v == 'S' || v == 's') {

            j = sc.nextInt();
        }


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
            System.out.print("\n"+(i+1) + ". " + n[i]);
            if (m[i] == true) {
                System.out.print(", el numero es positivo ");
                positivo++;
            }else {
                System.out.print(", el numero es negativo ");
                negativo++;
            }
        }
    }
}
