package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero max informado: ");
		int numero = scan.nextInt();
		int cont;
		boolean flag = false;
		for (int i = 1; i <= numero; i++) {
			cont = i -1;
			flag = false;
			while (cont > 1) {
				if (i % cont == 0) {
					System.out.println(i+" não é número Primo");
					flag = true;
					break;				
				}
				cont--;
			}
			if (!flag) {
				System.out.println(i+" é número Primo");
			}				
		}

	}

}
