package ut02;

import java.util.*;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Creamos un arreglo para almacenar las 25 notas de los alumnos
		double [] notas = new double [25];
		
		// Pedimos al usuario que ingrese las 25 notas
		System.out.println("Ingrese las 25 notas (entre 0 y 10):");
		
		// Leer las 25 notas e ingresarlas en el arreglo
        for (int i = 0; i < 25; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
		
         // Asegurarse de que las notas estén en el rango de 0 a 10
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Error: La nota debe estar entre 1 y 10.");
                System.out.print("Introduce nuevamente la nota del alumno " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();              
            }
        }
        
	     // Inicializamos las variables para la nota más alta y más baja
	        double notaMasAlta = notas[0];
	        double notaMasBaja = notas[0];
        
	     // Recorrer las notas para encontrar la más alta y la más baja
	        for (int i = 1; i < 25; i++) {
	            if (notas[i] > notaMasAlta) {
	                notaMasAlta = notas[i];
	            }
	            if (notas[i] < notaMasBaja) {
	                notaMasBaja = notas[i];
            }
        }

        // Mostrar el resultado en pantalla
        System.out.println("\nLa nota más alta es: " + notaMasAlta);
        System.out.println("La nota más baja es: " + notaMasBaja);
		
		
		sc.close();
	}

}
