package cursoJava;

import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.println("La raiz cuadrada de " + num2 + " es: ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		
	}

}
