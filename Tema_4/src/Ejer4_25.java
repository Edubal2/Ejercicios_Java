import java.util.Scanner;

public class Ejer4_25 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n1=0, n2=0, n3=0;
		boolean correcto=false;

		System.out.println("A continuación vas a introducir una cadena de numeros y te voy a decir si cumplen con las condiciones d ela corriente alterna: ");

		n1 = sc.nextInt();

		n2 = sc.nextInt();

		while(n3!=-1){
			n3 = sc.nextInt();

			if (n1 > n2 && n2 < n3){
				correcto = true;
			}
			if (n1 < n2 && n2 > n3){
				correcto = true;
			}
			n1 = n2;
			n2 = n3;
		}

		if(correcto==true){
			System.out.println("correcto");
		} else {
			System.out.println("incorrecto");
		}

	}
}

