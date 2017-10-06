package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor1: ");
		double valor1 = scan.nextDouble();
		System.out.println("Valor2: ");
		double valor2 = scan.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println(valor1);
		}if (valor1 < valor2) {
			System.out.println(valor2);			
		}
		else {
			System.out.println("Iguais");			
		}

	}

}
