import java.util.Scanner;
import java.util.Arrays;

public class Ejer3 {

	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		int[] vector = new int[0];
		int Y, n = 0, mediana = 0, menores = 0, longitud = 0;
		boolean buscarY = false;

		while(n!=1){
			System.out.print("\n\n************* MENU DE OPCIONES *************\nOpcion 1) Rellenar el vector\nOpcion 2) Calcular la mediana\nOpcion 3) Buscar un numero en el vector\nOpcion 4) Contar cuantos son menores que Y\nOpcion 5) Salir del programa\n********************************************\nIngresa la opcion:");
			n = sc.nextInt();
			switch(n){
				case 1:
					System.out.print("Introduce la longitud del vector: ");
					longitud = sc.nextInt();
					vector = rellenar(longitud);
					break;
				default:
					System.out.println("\nOpcion no valida");
					break;
			}
		}

		while (n!=5){
			System.out.print("\n\n************* MENU DE OPCIONES *************\nOpcion 1) Rellenar el vector\nOpcion 2) Calcular la mediana\nOpcion 3) Buscar un numero en el vector\nOpcion 4) Contar cuantos son menores que Y\nOpcion 5) Salir del programa\n********************************************\nIngresa la opcion:");
			n = sc.nextInt();
			switch(n){
				case 1:
					System.out.print("Introduce la longitud del vector: ");
					longitud = sc.nextInt();
					vector = rellenar(longitud);
					break;
				case 2:
					mediana = mediana(vector);
					break;
				case 3:
					System.out.println("Introduce un numero Y para ver si esta en la matriz o no");
					Y = sc.nextInt();
					buscarY = buscarY(vector,Y);
					break;
				case 4:
					System.out.println("Introduce un numero Y para ver cuantos numeros son menores que Y");
					Y = sc.nextInt();
					menores = menoresY(vector,Y);
					break;
				case 5:
					System.out.println("Saliendo del programa...");
					break;
			}
		}
	}

	public static int[] rellenar(int longitud){

		int[] vector = new int[longitud];
		for (int i = 0; i < vector.length; i++){
			vector[i] = (int)(Math.random()*100)-50;
		}
		System.out.println("Este es nuestro vector");
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + " ");
		}
		return vector;
	}

	public static int mediana(int[] vector){
		Arrays.sort(vector);
		int n = vector.length;
		int mediana = 0;
		if (n % 2 != 0) {
			mediana = vector[n/2];
		} else {
			// Longitud par: mediana es el promedio de los dos elementos centrales
			 mediana = (int) ((vector[(n / 2) - 1] + vector[n / 2]) / 2.0);
		}
		System.out.println("La mediana es: " + mediana);
		return mediana;
	}

	public static boolean buscarY(int[] vector, int Y){
		boolean buscarY = false;
		for(int i = 0; i < vector.length ; i++){
			if (vector[i]==Y) buscarY = true;
		}
		if (buscarY){
			System.out.println("El numero " + Y + " esta en el vector");
		}else {
			System.out.println("El numero " + Y + " no esta en el vector");
		}
		return buscarY;
	}

	public static int menoresY(int[] vector, int Y) {
		int menores = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < Y) menores++;
		}
		System.out.println("Hay " + menores + " numeros menores que " + Y);
		return menores;
	}

}
