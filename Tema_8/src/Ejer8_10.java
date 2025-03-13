public class Ejer8_10 {
    public static void main(String[] args) {
        String cadena= "Hola Mundo";
        System.out.println(cadena);
        StringBuilder sb = new StringBuilder(cadena);
        String reverse = sb.reverse().toString();

        System.out.println(reverse);
    }
}
