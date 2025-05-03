import java.util.Scanner;
    
public class Ejer3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salario_neto = 0;
        float tasa = 0;
        float salario_bruto;

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tus horas trabajadas: ");
        float horas = sc.nextFloat();

        System.out.print("Introduce la tarifa horaria: ");
        float tarifa = sc.nextFloat();

        if (horas<=35) {
            salario_bruto = horas * tarifa;
        } else {
            float horas_extra = horas - 35;
            salario_bruto = (35 * tarifa) + (horas_extra * 1.5f * tarifa);
        }

        if (salario_bruto < 500) {

            salario_neto = salario_bruto;

        }else if (salario_bruto > 500 && salario_bruto < 900) {

            float salario_bruto_tasa = salario_bruto - 500;
            tasa = salario_bruto_tasa * 0.25f;
            salario_neto = salario_bruto - tasa;

        }else if (salario_bruto > 900) {

           tasa = (salario_bruto - 800) * 0.45f;
           salario_neto = salario_bruto - tasa;

        }

        System.out.println("Nombre del trabajador: " + nombre);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Tasas: " + tasa);
        System.out.println("Salario neto: " + salario_neto);

    }
}