package ut02;

import java.util.*;

public class calcular_el_mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tres números: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El número mayor es: " + num1);
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.println("El número mayor es: " + num2);
		}
		
		else {
			System.out.println("El número mayor es: " + num3);
			
		}

		
		sc.close();
	}

}
