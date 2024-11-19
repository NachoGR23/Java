package ut02;

import java.util.*;

public class potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		double base = sc.nextDouble();
		
		System.out.print("Introduce el exponente: ");
		double exponente = sc.nextDouble();
		
		double resultado = Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
		
	sc.close();
	}

}
