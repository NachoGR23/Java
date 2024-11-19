package ut02;

import java.util.*;

public class numero_suerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el día de tu nacimiento: ");
		int dia = sc.nextInt();
		
		System.out.print("Introduce el mes de tu nacimiento: ");
		int mes = sc.nextInt();
		
		System.out.print("Introduce el año de tu nacimiento: ");
		int año = sc.nextInt();
		
		int suma = dia + mes + año;
		
		int suerte = (suma%10) + (suma/10)%10 + (suma/100)%10 + (suma/1000);
		
		System.out.println("Su número de la suerte es el " + suerte);
		
		
		sc.close();
	}

}
