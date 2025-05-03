package Ejercicios;

import java.util.Scanner;

class cuentaBancaria{
    String titular;
    float saldo;

    public cuentaBancaria(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(float cantidad){
        saldo += cantidad;
    }

    void retirar(float cantidad){
        if(cantidad > saldo){
            System.out.println("Saldo Insuficiente");
        }else {
            saldo -= cantidad;
        }
    }

    String obtenerSaldo(){
        return String.format("%.2f", saldo);
    }
}


public class Ejer10_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valor = "";

            System.out.print("Desea crear una cuenta en nuestro banco: S/n: ");
            valor = sc.nextLine();
        if (!valor.equalsIgnoreCase("s") && !valor.equals("")) {
            return;
        }

        float saldo = 0;
        System.out.print("Introduzca el titular: ");
        String titular = sc.nextLine();
        while(true) {
            System.out.print("Introduzca el saldo inicial: ");
             saldo = sc.nextFloat();
            if (saldo < 0) {
                System.out.println("El saldo no puede ser negativo");
            }else{
                break;
            }
        }

        cuentaBancaria cuenta = new cuentaBancaria(titular, saldo);


        while (true){
            System.out.println("\nMenu de opciones:\n1. Depositar\n2. Retirar\n3. Obtener Saldo\n4. Salir");

            int opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Cuanto saldo quiere depositar: ");
                    cuenta.depositar(Math.abs(sc.nextFloat()));
                    break;
                case 2:
                    System.out.println("Cuanto saldo quiere retirar: ");
                    cuenta.retirar(Math.abs(sc.nextFloat()));
                    break;
                case 3:
                    System.out.println("El saldo de la cuenta es: " + cuenta.obtenerSaldo());
                    break;
                case 4:
                    System.out.println("Saliendo ...");
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}
