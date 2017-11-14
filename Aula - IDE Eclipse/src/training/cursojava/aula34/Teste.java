package training.cursojava.aula34;

public class Teste {
	static int resultadoSoma;

	public static void main(String[] args) {
		//MinhaCalculadora calculadora = new MinhaCalculadora();
		
		//calculadora.soma(1,2);
		
		resultadoSoma = MinhaCalculadora.soma(1,2);
		System.out.println(resultadoSoma);
		resultadoSoma = MinhaCalculadora.soma(1,2);
		System.out.println(resultadoSoma);
	}

}
