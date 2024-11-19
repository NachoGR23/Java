package ut02;

import java.util.*;

public class año_bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un año para saber si es bisiesto: ");
		
		int año = sc.nextInt();
		
		if (año % 4 == 0 && !(año % 100 == 0 && año % 400 != 0)) {
			
			System.out.println("El año " + año + " SI es bisiesto");
		}
		
		else {
			System.out.println("El año " + año + " NO es bisiesto");
		}
		
		sc.close();
	}

}
