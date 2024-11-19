package ut02;

import java.util.*;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el dividendo: ");		
		double dividendo = sc.nextDouble();
		
		System.out.print("Introduce el divisor: ");
		double divisor = sc.nextDouble();
		
		double resultado = dividendo/divisor;
		
		if (divisor == 0) {
			
			System.out.println("El divisor no puede ser 0");
		}
		else {
			
			System.out.println(dividendo + "/" + divisor + " = " + resultado);
		}
		
		sc.close();
	}

}
