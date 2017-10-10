package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor: ");
		int valor = scan.nextInt();
		
		if (valor >= 0) {
			System.out.println("é positivo");
		}
		else {
			System.out.println("é negativo");
		}

	}

}
