package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo = 1;
		double quantidade; 
		double soma = 0;
		while (codigo != 0) {
			System.out.print("Codigo do produto (0-sair): ");
			codigo = scan.nextInt();
			switch (codigo) {
			case 100:
				System.out.print("Quantidade de Cachorro quente: ");
				quantidade = scan.nextInt();
				soma += (quantidade*1.20);
				break;
			case 101:
				System.out.print("Quantidade de Bauru Simples: ");
				quantidade = scan.nextInt();
				soma += (quantidade*1.30);
				break;
			case 102:
				System.out.print("Quantidade de Bauru com ovo: ");
				quantidade = scan.nextInt();
				soma += (quantidade*1.50);
				break;
			case 103:
				System.out.print("Quantidade de Hambúrger: ");
				quantidade = scan.nextInt();
				soma += (quantidade*1.20);
				break;
			case 104:
				System.out.print("Quantidade de Cheeseburger: ");
				quantidade = scan.nextInt();
				soma += (quantidade*1.30);
				break;
			case 105:
				System.out.print("Refrigerante: ");
				quantidade = scan.nextInt();
				soma += (quantidade*1.00);
				break;				
			default:
				continue;
			}
		}
		System.out.println("Valor total: "+soma);
	}

}
