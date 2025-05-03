import java.util.Scanner;

public class Ejer3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, num3;
        int op;

                do{
                    System.out.print("Menu:\n1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\nElige una opción: ");
                    op = sc.nextInt();

                    switch (op) {
                        case 1:
                            System.out.print("Vas a realizar una Suma \nIntroduce dos numeros para sumarlos: ");
                            num1 = sc.nextFloat();
                            num2 = sc.nextFloat();
                            num3 = num1 + num2;
                            System.out.println("EL resultado de la suma es: "+num3);
                            break;

                        case 2:
                            System.out.print("Vas a realizar una Resta\nIntroduce dos numeros para restarlos: ");
                            num1 = sc.nextFloat();
                            num2 = sc.nextFloat();
                            num3 = num1 - num2;
                            System.out.println("EL resultado de la resta es: "+num3);
                            break;

                        case 3:
                            System.out.print("Vas a realizar una Multiplicación\nIntroduce dos numeros para multiplicarlos: ");
                            num1 = sc.nextFloat();
                            num2 = sc.nextFloat();
                            num3 = num1 * num2;
                            System.out.println("EL resultado de la multiplicación es: "+num3);
                            break;

                        case 4:
                            System.out.print("Vas a realizar una División\nIntroduce dos numeros para dividirlos: ");
                            num1 = sc.nextFloat();
                            num2 = sc.nextFloat();
                            num3 = num1 / num2;
                            System.out.println("EL resultado de la divison es: "+num3);
                            break;
                        default:
                            System.out.println("Ese numero no es una opción correcta\n");
                            break;

                    }
                }while(op<1 || op>4);
    }
}
