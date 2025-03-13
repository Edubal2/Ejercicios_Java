import java.util.Random;

public class Ejer9_6 {
    public static void main(String[] args) {
        System.out.println(aleatorio());
    }
    public static int aleatorio(){
        Random ran = new Random();
        return ran.nextInt(0,10);
    }
}
