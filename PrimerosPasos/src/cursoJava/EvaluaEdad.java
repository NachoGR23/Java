package cursoJava;

import java.util.*;

public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor: ");
		int edad = sc.nextInt();
		
		if (edad < 18) {
			System.out.println("Eres un adolescente");
		}
		
		else if (edad < 40) {
			System.out.println("Eres un joven");
		}
		
		else if (edad < 65) {
			System.out.println("Eres maduro");
		}
		
		else {
			System.out.println("Cuídate");
		}
		
		sc.close();
	}

}
