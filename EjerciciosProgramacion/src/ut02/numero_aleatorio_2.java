package ut02;

import java.util.*;

public class numero_aleatorio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduzca un número mayor que el anterior: ");
		int num2 = sc.nextInt();
		
		System.out.println("Vamos a buscar un número aleatorio entre " + num1 + " y " + num2);
		
		int aleat = (int)(Math.random()*(num1-num2+1) + num2);
		
		System.out.println("El número aleatorio es: " + aleat);
		
		sc.close();
	}

}
