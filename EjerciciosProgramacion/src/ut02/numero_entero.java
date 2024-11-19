package ut02;

import java.util.*;

public class numero_entero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		
		int num = sc.nextInt();
		
		System.out.println((num >= 0)?"Positivo":"Negativo");
		System.out.println((num %2 == 0)?"Par":"Impar");
		System.out.println((num %5 == 0)? "Es múltiplo de 5":"No es múltiplo de 5");
		System.out.println((num %10 == 0)? "Es múltiplo de 10":"No es múltiplo de 10");
		System.out.println((num >= 100)?"Es mayor o igual que 100":"Es menor que 100");
		
		sc.close();
	}

}
