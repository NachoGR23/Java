package ut02;

import java.util.*;

public class numero_aleatorio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introzca un número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introzca un número: ");
		int num2 = sc.nextInt();
		
		int aleat = (int)(Math.random()*(num2-num1+1) + num1);
		
		System.out.println("El número aleatorio es: " + aleat);
		
		sc.close();
	}

}
