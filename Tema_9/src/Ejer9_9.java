import java.time.LocalDate;

public class Ejer9_9 {
    public static void main(String[] args) {
        switch (day()){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                 System.out.println("Invalid day");
            break;
        }
    }

    public static int day() {
        int dia = LocalDate.now().getDayOfWeek().getValue();
        return dia;
    }
}
