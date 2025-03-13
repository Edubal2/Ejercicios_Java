public class Ejer7_1 {
    public static void main(String[] args) {

        char[][] matriu = {
                {'a','h','f','h'},
                {'l','y','w','p','q','y'},
                {'c','z','p','r','t'},
                {'f','g','e','q','x','r','t','y'}
        };

        int num = 0;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(" "+matriu[i][j]);
                num++;
            }
                System.out.println();
        }
        System.out.println("La matrix tiene " + num + " letras");

    }
}
