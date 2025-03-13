import java.util.Scanner;

public class Ejer4_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1=0, n2=0, n3=0, a1=0, a2=0, a3=0;
        boolean abierto=false;

        System.out.println("Introduce los 3 numeros de la combinación de la puerta: ");

        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();

        System.out.println("A continuación vas a introducir una cadena de numeros y te voy a decir si abres la puerta: ");

        n1 = sc.nextInt();

        n2 = sc.nextInt();

        while(n3!=-1){
            n3 = sc.nextInt();

            if (n1 ==a1 && n2==a2 && n3==a3){
                abierto = true;
            }
            n1 = n2;
            n2 = n3;
        }

        if(abierto==true){
            System.out.println("Abierta");
        } else {
            System.out.println("Cerrada");
        }

    }
}