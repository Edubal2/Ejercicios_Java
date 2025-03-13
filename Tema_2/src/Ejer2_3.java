public class Ejer2_3 {
    public static void main(String[] args) {

        int a = 4, b = 6;
        int c = a + b;
        int result = c + (a + b) * c;

        System.out.println(result + "\n\n--------------------------------------------------------------------------\n");

        System.out.println("\n            -----------------\n            |   a   |   b   |\n            -----------------            ");
        a = 0;
        System.out.println("int a = 0;  |   " + a + "   |   " + b + "   |");
        b = a + 1;
        System.out.println("b = a + 1;  |   " + a + "   |   " + b + "   |");
        a = a +1;
        System.out.println("a = a +1;   |   " + a + "   |   " + b + "   |");
        b *= 2;
        System.out.println("b *= 2;     |   " + a + "   |   " + b + "   |");
        a++;
        System.out.println("a++;        |   " + a + "   |   " + b + "   |");


        System.out.println("\n--------------------------------------------------------------------------\n");

        System.out.println("\n            -----------------\n            |   a   |   b   |\n            -----------------            ");
        a = 10;
        System.out.println("a = 10;     |   " + a + "  |   " + b + "   |");
        b = a + 10;
        System.out.println("b = a + 10; |   " + a + "  |   " + b + "  |");
        a += 10;
        System.out.println("a += 10;    |   " + a + "  |   " + b + "  |");
        a += b;
        System.out.println("a += b;     |   " + a + "  |   " + b + "  |");
        a += a + b;
        System.out.println("a += a + b; |  " + a + "  |   " + b + "  |");
        a += a + a;
        System.out.println("a += a + a; |  " + a + "  |   " + b + "  |");
    }
}
