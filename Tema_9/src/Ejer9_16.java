import java.util.Scanner;

public static String mayorEdad(int edad){
    String respuesta = "";
    if (edad < 18){
        respuesta = "No es mayor de edad";
    }else {
        respuesta = "Si que es mayor de edad";
    }
    return respuesta;
}


public void main() {
    Scanner sc = new Scanner(System.in);
    int edad = sc.nextInt();
    System.out.println(mayorEdad(edad));

}


