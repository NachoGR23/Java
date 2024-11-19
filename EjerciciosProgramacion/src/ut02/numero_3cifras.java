package ut02;

import java.util.*;

public class numero_3cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número de 3 cifras: ");
		
		int num = sc.nextInt();
		
		int unidades = num%10;
		int decenas = (num/10)%10;
		int centenas = num/100;
		
		System.out.println("Unidades: " + unidades);
		System.out.println("Decenas: " + decenas);
		System.out.println("Centenas: " + centenas);
		
		sc.close();
	}

}
