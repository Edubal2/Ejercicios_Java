import java.util.Scanner;

public class Ejer9_18 {

    public static String valor(int a){
        String respuesta = "";
        if (a > 0){
            respuesta = "positivo";
        }else if (a < 0){
            respuesta = "negativo";
        }else if (a == 0){
            respuesta = "cero";
        }

        return respuesta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(valor(sc.nextInt()));

    }
}
