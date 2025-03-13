public class Ejer8_11 {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        String cadena2 = "hola mundo";
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println("Son estas dos cadenas iguales sin tener en cuneta las mayusculas o minusculas?");

        System.out.println(cadena1.toLowerCase().equals(cadena2.toLowerCase()));
    }
}
