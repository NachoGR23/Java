package ut02;

import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un número mayor que 0 para calcular su factorial:");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("El número debe ser mayor que 0");
		}
		else {
			long fact = 1;
			
			for (int i = 1; i <= num; i++) {
				fact *= i;					
			}
				
		System.out.println("El factorial de " + num + " es igual a " + fact);
		}
		
		sc.close();
	}

}
