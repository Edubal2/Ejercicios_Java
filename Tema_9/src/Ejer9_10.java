public class Ejer9_10 {

    public static int random() {
        return (int) (Math.random() * 6) + 1;
    }

    public static String dado() {
          switch (random()) {
            case 1:
                return "⚀";
            case 2:
                return "⚁";
            case 3:
                return "⚂";
            case 4:
                return "⚃";
            case 5:
                return "⚄";
            case 6:
                return "⚅";
            default:
                return "Numero invalido";
          }
    }


    public static void main(String[] args) {
        System.out.println(dado());
    }
}


