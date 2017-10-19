package training.cursojava.exercicios.aulas16a17;


public class Exercicio16 {

	public static void main(String[] args) {
		int fibonaci = 1;
		int antes = 0;
		int valor = 0;
		while (fibonaci <= 500) {
			valor = antes + fibonaci;
			antes = fibonaci;
			fibonaci = valor;
			System.out.print(fibonaci+",");
		}
		System.out.println("\nResultado: "+fibonaci);
	}

}
