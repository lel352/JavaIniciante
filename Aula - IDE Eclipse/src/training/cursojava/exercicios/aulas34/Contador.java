package training.cursojava.exercicios.aulas34;

public class Contador {
	
	private static int contador;
	
	Contador(){
		zeraContador(); 
	}
	
	public static void zeraContador(){
		contador = 0; 
	}
	
	
	public static void incrementar() {
		contador++;
	}
	
	public static int obterValor() {
		return contador;
	}

}
