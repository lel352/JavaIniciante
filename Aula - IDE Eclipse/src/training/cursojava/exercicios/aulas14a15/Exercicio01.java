package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor1: ");
		double valor1 = scan.nextDouble();
		System.out.println("Valor2: ");
		double valor2 = scan.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println(valor1);
		}
		else if (valor1 < valor2) {
			System.out.println(valor2);			
		}
		else {
			System.out.println("Iguais");			
		}

	}

}
