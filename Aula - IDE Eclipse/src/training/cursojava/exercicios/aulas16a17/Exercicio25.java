package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		double soma;
		int i;
		double dinheiro;
		double troco;
		String resposta = "N";
		while (!resposta.equalsIgnoreCase("S")) {
			System.out.println("\n-------------------------------");
			i = 1;
			soma = 0;
			troco = 0;
			dinheiro = 0;
			do {
				System.out.print("Produto " + i + ": R$ ");
				valor = scan.nextDouble();
				i++;
				soma += valor;
			} while (valor != 0);
			System.out.print("\nTotal: R$ " + soma);
			do {
				System.out.print("\nDinheiro: ");
				dinheiro = scan.nextDouble();
				if (dinheiro < soma)
					System.out.println("\nDinheiro dado menor que o valor toal");
			} while (dinheiro < soma);
			troco = dinheiro - soma;
			System.out.print("\nTroco: R$ " + troco);
			System.out.println("\nSair do Sistema S-Sim ");
			resposta = scan.next();
		}
		System.out.println("\nSaiu ");
	}

}
