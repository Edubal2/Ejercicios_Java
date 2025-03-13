import java.util.Scanner;

public class Ejer9_13 {

    public static String[] array() {
        String[] menu = {"Crear usuario","Eliminar usuario","Ver estadisticas", "Salir"};
        return menu;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;


        do {

            for (int i = 0; i < array().length; i++) {
                System.out.println(i + 1 + ": " + array()[i]);
            }
            System.out.println("Elige un opcion de 1 a 4: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del usuario");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del usuario a eliminar");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del usuario par ver sus estadisticas");
                    break;
                case 4:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion< 1 || opcion > 4);

    }
}
