public class Ejer8_2 {
    public static void main(String[] args) {
        String cadena = "hola (mundo) cruel";

        int a = cadena.indexOf('(');
        int b = cadena.lastIndexOf(')');
        String mundo = cadena.substring(a+1, b);
        System.out.println(mundo);
    }
}
