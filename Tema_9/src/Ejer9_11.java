import java.time.LocalDate;

public class Ejer9_11 {

    public static String navidad() {
        int dia = LocalDate.now().getDayOfMonth();
        int mes = LocalDate.now().getMonthValue();
        String arbol ="";
        if (mes == 12 || mes == 1 && dia < 7 ){
            arbol = "\uD83C\uDF84";
        }
            return arbol;
    }

    public static void main(String[] args) {
        System.out.println(navidad());
    }
}
