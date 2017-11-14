package training.cursojava.aula33;

public class Teste {

	public static void main(String[] args) {
		MinhaCalculadora calculadora = new MinhaCalculadora();
		
		calculadora.soma(1,2);
		
		System.out.println(calculadora.soma(1,2));
		System.out.println(calculadora.soma(1.6,2));
	}

}
