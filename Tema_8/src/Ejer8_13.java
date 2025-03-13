public class Ejer8_13 {
    public static void main(String[] args) {
        String cadena = "Soy productivo programando en Prolog";
        String pref = "pro";
        String cadena2="";
        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].toLowerCase().startsWith(pref.toLowerCase())) {
                cadena2 += palabras[i] + " ";
            }
        }

        System.out.println(cadena2);


    }
}
