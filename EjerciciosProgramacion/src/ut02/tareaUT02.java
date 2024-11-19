package ut02;

import java.util.Scanner;

public class tareaUT02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Creamos un objeto Scanner para leer los datos introducidos por el usuario
				Scanner sc = new Scanner(System.in);
				
				//Pedimos al usuario los valores de los catetos
				System.out.print("Introduce el valor del primer cateto: ");
						double cateto1 = sc.nextDouble();
						
				System.out.print("Introduce el valor del segundo cateto: ");
						double cateto2 = sc.nextDouble();
				
				//Calculamos el valor de la hipotenusa y la almacenamos en una variable
				double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
						
				//Calculamos el área
				double area = (cateto1 * cateto2) / 2;
				
				//Calculamos el perímetro
				double perimetro = cateto1 + cateto2 + hipotenusa;
				
				//Mostramos el resultado obtenido
				System.out.println("El área del triángulo rectángulo es: "+ area);
				System.out.println("El perímetro del triángulo rectángulo es: "+ perimetro);
				
				//Cerramos el scanner
				sc.close();
	}

}
