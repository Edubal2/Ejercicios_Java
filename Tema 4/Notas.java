import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        int[] contadorNotas = new int[11]; // Arreglo para contar cada nota de 0 a 10
        int aprobados = 0; // Contador de notas aprobadas (5 o más)

        System.out.println("Introduce las notas (de 0 a 10). Para finalizar, introduce -1:");

        while (true) {
            int nota = sc.nextInt();

            // Termina la entrada de datos al recibir -1
            if (nota == -1) {
                break;
            }

            // Verificación del rango de notas
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Introduce una nota entre 0 y 10.");
                continue;
            }

            // Añadir la nota a la lista y al contador
            notas.add(nota);
            contadorNotas[nota]++; // Incrementa el contador de la nota específica
            if (nota >= 5) {
                aprobados++; // Cuenta como aprobado si la nota es 5 o más
            }
        }

        // Mostrar todas las notas introducidas con mensajes personalizados
        System.out.println("\nNotas introducidas en orden:");
        for (int i = 0; i < notas.size(); i++) {
            int nota = notas.get(i);
            System.out.print("Nota " + (i + 1) + ": " + nota);

            // Mensajes personalizados según el valor de la nota
            if (nota == 10) {
                System.out.println(" - Enhorabuena, has sacado la máxima nota.");
            } else if (nota == 9) {
                System.out.println(" - Has sacado un sobresaliente.");
            } else if (nota == 8 || nota == 7) {
                System.out.println(" - Has sacado un notable.");
            } else if (nota == 6 || nota == 5) {
                System.out.println(" - Has aprobado.");
            } else {
                System.out.println(" - Has suspendido.");
            }
        }

        // Mostrar el recuento de cada nota
        System.out.println("\nRecuento de cada nota:");
        for (int i = 0; i < contadorNotas.length; i++) {
            if (contadorNotas[i] > 0) {
                System.out.println("Nota " + i + ": " + contadorNotas[i] + " veces");
            }
        }

        // Calcular y mostrar el porcentaje de aprobados
        double porcentajeAprobados = (aprobados * 100.0) / notas.size();
        System.out.printf("\nPorcentaje de aprobados: %.2f%%\n", porcentajeAprobados);
    }
}

