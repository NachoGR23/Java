package ut02;

public class planetas_enum {

	public enum Planetas {
        MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO;
    }

    public static void main(String[] args) {
    	
    	// Obtener el primer planeta
        Planetas primerPlaneta = Planetas.values()[0];

        // Mostrar el nombre del primer planeta
        System.out.println("El primer planeta es: " + primerPlaneta);

        // Mostrar la posición (ordinal) del primer planeta
        System.out.println("El primer planeta ocupa la posición: " + primerPlaneta.ordinal());

        // Obtener el número total de planetas
        int numeroDePlanetas = Planetas.values().length;

        // Mostrar el número total de planetas
        System.out.println("El número total de planetas es: " + numeroDePlanetas);
    
    }
}
