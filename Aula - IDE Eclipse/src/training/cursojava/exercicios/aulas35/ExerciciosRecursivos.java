package training.cursojava.exercicios.aulas35;

public class ExerciciosRecursivos {
	
	
	public static int somatorio(int numero) {
		if (numero == 1)
			return 1;
		
		return numero + somatorio(numero-1);
	}
	
	public static int fibonaci(int termo) {
		if (termo <=  2)
			return 1;
			
		return fibonaci(termo-1)+fibonaci(termo-2);
	}
}