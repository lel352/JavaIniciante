package training.cursojava.aula34;

public class MinhaCalculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double soma(double num1, int num2) {
		return num1 + num2;
	}
	
	public static int soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int soma(int[] vetorInteiros) {
		int soma = 0;
		for (int vetor : vetorInteiros) {
			soma += vetor;			
		}
		return soma;
	}
	
}
