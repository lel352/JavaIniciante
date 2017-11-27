package training.cursojava.aula35;

public class Calculadora {
	
	public static int fatorialNaoRecursivo(int numero1) {
		if (numero1 == 0) 
			return 1;
		int f = numero1;
		int valor = f;
		for (int i = (f-1); i > 0; i--) {
			valor *= i;
		}
 		return valor; 
	}
	
	public static int fatorial(int numero) {
		if (numero == 0)
			return 1;	
		return numero * fatorial(numero-1);
	}
	
}
