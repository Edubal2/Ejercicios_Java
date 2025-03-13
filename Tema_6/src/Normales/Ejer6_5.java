package Normales;

import java.util.Scanner;

public class Ejer6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] n = new int[N];
        int c = N-1;
        boolean capi = true;

        for (int i = 0; i < N; i++){
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < N/2; i++) {

            if (n[i] != n[c]){
                capi = false;
                break;
            }
            c--;
        }
        System.out.println(capi);
    }
}
