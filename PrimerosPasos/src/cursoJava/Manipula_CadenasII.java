package cursoJava;

public class Manipula_CadenasII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen = frase.substring(29, 57);
		
		System.out.println(frase_resumen);
		
		String frase_resumen_2 = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo";
		
		System.out.println(frase_resumen_2);
		
		
		
		String alumno1, alumno2;
		
		alumno1="David";
		
		alumno2="david";
		
		System.out.println(alumno1.equals(alumno2));
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
	}

}
