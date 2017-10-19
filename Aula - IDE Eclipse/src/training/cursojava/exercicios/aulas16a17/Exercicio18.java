package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		int cont =numero-1;
		boolean flag = false;
		while (cont > 1) {
			if (numero % cont == 0) {
				System.out.println(numero+" não é Primo");
				flag = true;
				break;				
			}
			cont--;
		}
		if (!flag) {
			System.out.println(numero+" é número Primo");
		}		
	}
}
