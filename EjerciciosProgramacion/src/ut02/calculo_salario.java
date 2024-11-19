package ut02;

import java.util.Scanner;

public class calculo_salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//La hora ordinaria se le paga a 8.25€/hora.
		//Las horas extraordinarias se le pagan a 12€/hora.
		//La jornada laboral normal es de 40 horas/semana.
		//Las horas trabajadas que superen dicha cantidad, serán consideradas horas extraordinarias.
		
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las constantes:
		final double h_Ord = 8.25;
		final double h_Extra = 12;
		final double j_Lab = 40;
		
		//Solicitamos al trabajador las horas trabajadas:
		System.out.println("Introduzca las horas trabajadas esta semana: ");	
		double h_trabajadas = sc.nextDouble();
		
		double salario;
		
		if (h_trabajadas <= j_Lab) {
			salario = h_trabajadas * h_Ord;
			
		}else {
			double horasExtra = h_trabajadas - j_Lab;
			salario = (j_Lab * h_Ord) + (horasExtra * h_Extra);
		}
		
		System.out.println("Su salario semanal es de " + salario + "€");
		
		sc.close();
	}

}
