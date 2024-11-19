package ut02;

import java.util.*;

public class numero_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		
		int num = sc.nextInt();
		
		if (num%2 == 0)
        {
            System.out.println("El número es par");
        }
        else
        {
            System.out.println("El número es impar");
        }
		
		sc.close();
	}

}
