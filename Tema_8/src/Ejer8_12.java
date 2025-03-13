public class Ejer8_12 {
    public static void main(String[] args) {

        String cadena ="Me gusta Steam. Practico mucho Steam";
        System.out.println("Tenemos esta cadena: \"" + cadena + "\". Y queremos reemplazar \"Steam\n con \"java\"");

        String replaced = cadena.replace("Steam", "Java");
        System.out.println(replaced);
    }
}
