package ut02;

import java.util.*;

public class calcular_hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce las horas: ");
		int h = sc.nextInt();
		
		System.out.print("Introduce los minutos: ");
		int m = sc.nextInt();
		
		System.out.print("Introduce los segundos: ");
		int s = sc.nextInt();
		
		
		if (h >= 0 && h < 24 &&
			m >= 0 && m < 60 &&
			s >= 0 && s < 60) {
			
			System.out.println("Son las " + h + ":" + m + ":" + s);
			
		}
		
		else {
			System.out.println("La hora introducida es incorrecta");
		}
		
		sc.close();
	}

}
