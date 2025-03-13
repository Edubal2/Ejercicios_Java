public class Ejer8_3 {
    public static void main(String[] args) {
        String cadena = "hola -mundo- curel";

        int a = cadena.indexOf("-");
        int b = cadena.lastIndexOf("-");
        String mundo = cadena.substring(a+1, b);
        System.out.println(mundo);
    }
}
