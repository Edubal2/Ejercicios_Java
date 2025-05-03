import java.util.Scanner;
public class Ejer3_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int  tabla[][]  = new int [3][3];
        int j=0, i=0;
        boolean correcto = true, Jugador1 = false, Jugador2 = false;

        do {
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {

                    tabla[i][j] = sc.nextInt();

                    if (tabla[i][j] >= 3 ) {
                        correcto = false;
                    }
                }
            }
            if (correcto == false) {
                System.out.println("un numero sobrepasa 2 vuelve a introducirlos");
            }
        }while(correcto == false);

        for (i = 0; i < 3; i++) {
            if (tabla[i][0] == tabla[i][1] && tabla[i][1] == tabla[i][2] && tabla[i][0] != 0) {
                if (tabla[i][0] == 1){
                    Jugador1 = true;
                }
                if(tabla[i][0] == 2){
                    Jugador2 = true;
                }
            }
            if (tabla[0][i] == tabla[1][i] && tabla[1][i] == tabla[2][i] && tabla[0][i] != 0){
                if (tabla[0][i] == 1){
                    Jugador1 = true;
                }
                if(tabla[0][i] == 2){
                    Jugador2 = true;
                }
            }
            if (tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2] && tabla[0][0] != 0) {
                if (tabla[0][i] == 1){
                    Jugador1 = true;
                }
                if(tabla[0][i] == 2){
                    Jugador2 = true;
                }
            }
            if(tabla[0][2] == tabla[1][1] && tabla[1][1] == tabla[2][0] && tabla[0][2] != 0){
                if (tabla[0][i] == 1){
                    Jugador1 = true;
                }
                if(tabla[0][i] == 2){
                    Jugador2 = true;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            System.out.print("\n");
            for (j = 0; j < 3; j++) {
                System.out.print(tabla[i][j]);
                System.out.print(" ");
            }
        }

        if ((Jugador1 == true && Jugador2 == true) || (Jugador1 == false && Jugador2 == false) ) {
            System.out.println("\n\nEmpate");
        }else if (Jugador1 == true){
            System.out.println("\n\nGana el jugador1");
        }else if (Jugador2 == true){
            System.out.println("\n\nGana el jugador2");
        }
    }
}
