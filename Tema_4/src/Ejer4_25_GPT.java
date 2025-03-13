import java.util.Scanner;

public class Ejer4_25_GPT {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce una secuencia de números (introduce 0 para terminar):");

            int primero = scanner.nextInt();
            int segundo = scanner.nextInt();
            boolean correcto = true;

            while (true) {
                int tercero = scanner.nextInt();
                if (tercero == 0) {
                    break;
                }
                // Verificar las condiciones
                if (segundo == primero) {
                    correcto = false;
                    break;
                } else if ((segundo > primero && tercero >= segundo) || (segundo < primero && tercero <= segundo)) {
                    correcto = false;
                    break;
                }
                // Actualizar para la siguiente iteración
                primero = segundo;
                segundo = tercero;
            }

            if (correcto) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
            
            if (correcto) {
                System.out.println("Correcto");

            }
        }
    }
