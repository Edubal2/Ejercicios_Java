public class Ejer9_5 {
    public static void main(String[] args) {
        System.out.println(Exclamacion());
    }
    public static String obtenerMensaje(){
        return "hola mundo";
    }
    public static String Exclamacion(){
        return obtenerMensaje() + "!!!";
    }
}
