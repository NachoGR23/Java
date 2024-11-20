package cursoJava;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int aleat = (int)(Math.random()*100);
		
		int num = 0;
		
		int intentos = 0;
		
		do {
			
			intentos++;
			
			System.out.println("Introduce un número:");
			
			num = sc.nextInt();
			
			if (aleat < num) {
				
				System.out.println("Más bajo");
			}
			
			else if (aleat > num) {
				
				System.out.println("Más alto");
				
			}
			
		}
		
		while (num != aleat);
		
		System.out.println("¡Correcto! Lo has conseguido en " + intentos + " intentos");
		
	}

}
