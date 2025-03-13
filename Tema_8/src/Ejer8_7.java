public class Ejer8_7 {
    public static void main(String[] args) {
        String cadena = "c:\\user\\john";
        String cambiada = "0";


        if(cadena.startsWith("\\")==false){
            int a = cadena.indexOf("\\");
            cambiada = cadena.substring(a);

        }
        cambiada = cambiada.replace('\\','/');
        System.out.println(cambiada);
    }
}
