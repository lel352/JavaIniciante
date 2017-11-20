package training.cursojava.exercicios.aulas34;

public class Teste {
	
	public static void ImprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void ImprimirValor(int resultado) {
		System.out.println(resultado);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		resultado = Calculadora.soma(1, 2);
		ImprimirValor(resultado);
		
		resultado = Calculadora.dividir(4, 2);
		ImprimirValor(resultado);
		
		resultado = Calculadora.multiplicar(4, 2);
		ImprimirValor(resultado);
		
		resultado = Calculadora.subtrair(4, 2);
		ImprimirValor(resultado);
		
		resultado = (int) Calculadora.elevar(4, 2);
		ImprimirValor(resultado);
		
		resultado = Calculadora.fatorial(0);
		ImprimirValor(resultado);
		
		
		/* Cotador
		 * ImprimirValor();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		ImprimirValor();
		Contador.zeraContador();
		ImprimirValor();
		Contador.incrementar();
		Contador.incrementar();
		ImprimirValor();*/
	}
}
