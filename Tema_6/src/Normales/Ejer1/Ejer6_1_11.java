package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        int[] b = new int[100];
        int j = 99;

        for (int i = 0; i < 100; i++) {
            a[i] = i+1;
            b[j] = i+1;
            j--;
        }
        System.out.println("Primera Matriz");
        for (int i = 0; i < 100; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nSegunda Matriz");
        for (int i = 0; i < 100; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
