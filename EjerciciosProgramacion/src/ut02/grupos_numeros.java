package ut02;

import java.util.*;

public class grupos_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        // Crear un arreglo para almacenar los 10 números
        int[] numeros = new int[10];

        // Variables para contar las categorías
        int menoresQue18 = 0;
        int mayoresQue65 = 0;
        int entre18y65 = 0;

        // Pedir al usuario que ingrese 10 números
        System.out.println("Introduce 10 números enteros:");

        // Leer los 10 números e ingresarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Analizar los números e incrementar los contadores según corresponda
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 18) {
                menoresQue18++;
            } else if (numeros[i] > 65) {
                mayoresQue65++;
            } else {
                entre18y65++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números menores que 18: " + menoresQue18);
        System.out.println("Cantidad de números mayores que 65: " + mayoresQue65);
        System.out.println("Cantidad de números entre 18 y 65: " + entre18y65);
		
		
		sc.close();
	}

}
