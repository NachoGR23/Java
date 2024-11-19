package ut02;

import java.util.*;

public class centigrados_fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los grados centígrados: ");
		
		double centigrados = sc.nextDouble();
		
		double fahrenheit = 32 + ( 9 * centigrados / 5);
		
		System.out.println(centigrados + " º Centígrados son " + fahrenheit + " º Fahrenheit.");
		
		sc.close();
		
	}

}
