package training.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Diga sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade !!!");
		}
		else {
			System.out.println("Não é maior de idade !!!");
		}
		
		//preço <= 10
		//10 < valor < 15 perdir desconto
		//15 >= valor < 17 pesquisar
		// valor >= 17 caro
		
		System.out.println("Valor: ");
		double valor = scan.nextDouble();
		if (valor <= 10) {
		   System.out.println("Barato, leva !!");
		}
		else if ((valor > 10) && (valor < 15)) {
           System.out.println("Pedidr desconto !!");
		}
		else if ((valor >= 15) && (valor < 17)) {
			System.out.println("Pesquisar mais !!");
		}
		else {
			System.out.println("Caro demais !!");
		} 
		
	}
}
