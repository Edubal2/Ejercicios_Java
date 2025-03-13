public class Ejer9_12 {

    public static String[] array() {

        return new String[] {"Crear usuario",
                             "Eliminar usuario",
                             "Ver estadisticas",
                             "Salir"};
    }


    public static void main(String[] args) {

        for (int i = 0; i < array().length; i++) {
            System.out.println(i+1 + ": " + array()[i]);
        }
    }
}
