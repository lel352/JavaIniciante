package training.cursojava.exercicios.aulas16a17;

public class Exercicio23 {

	public static void main(String[] args) {
		System.out.println("Loja quase 2 - Tabelas de Preços");
		double valor = 0;
		for (int i = 1; i <= 50; i++) {
			valor += 1.99;
			System.out.println((i)+" - R$ "+valor);
		}
		//ou
		for (int i = 1; i <= 50; i++) {
			System.out.println((i)+" - R$ "+(1.99*i));
		}
	}
}
