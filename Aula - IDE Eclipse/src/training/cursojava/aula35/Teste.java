package training.cursojava.aula35;

public class Teste {
	static int resultadoSoma;

	public static void main(String[] args) {
		resultadoSoma = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(resultadoSoma);
		resultadoSoma = Calculadora.fatorial(5);
		System.out.println(resultadoSoma);
	}

}
