public class Ejer2_2 {
    public static void main(String[] args) {
        System.out.println("Hola " + "mon");
        System.out.println("Hola " + 330);
        System.out.println("Hola " + 'm' + 'o' + 'n');
        System.out.println("Hola " + ('m' + 'o' + 'n'));
        System.out.println('m' + 'o' + 'n' + "Hola");

        System.out.println();

        int a = 2;
        int b = 3;

        System.out.println("" + a + b);
        System.out.println("" + a * b);
        System.out.println(a * b + "");
        System.out.println(a + b + "");
        System.out.println(a + "" /* * b */); //no se ejecuta
        System.out.println(/*a  * */"" + b); //no se ejecuta
    }
}
