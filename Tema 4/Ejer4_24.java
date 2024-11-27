import java.util.Scanner;

public class Ejer4_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0,i=0,inter;
        int []num = new int[100];

        System.out.println("Introdusca una secuencia de numeros y le imprimire los intervalos entre cada nuemro(-1 para terminar): ");

        while(true){
            n = sc.nextInt();
            if(n==-1)break;
            num[i]=n;
            i++;
        }

        for (int j=0;j<i-1;j++){
            inter = Math.abs(num[j]-num[j+1]);
            System.out.println(inter);
        }




    }
}
