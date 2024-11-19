package ut02;

import java.util.*;

public class numero_aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Vamos a buscar un número aleatorio entre el 1 y el número que introduzca. Introduzca un número: ");
		
		int num = sc.nextInt();
		
		int aleat = (int)(Math.random()*num+1);
		
		System.out.println("El número aleatorio es: " + aleat);
		
		
		sc.close();
	}

}
