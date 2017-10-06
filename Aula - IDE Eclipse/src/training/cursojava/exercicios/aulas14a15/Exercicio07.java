package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor1: ");
		double valor1 = scan.nextDouble();
		System.out.println("Valor2: ");
		double valor2 = scan.nextDouble();
		System.out.println("Valor3: ");
		double valor3 = scan.nextDouble();
		
		double maior = valor1;
		double menor = valor1;
		if (maior < valor2)
			maior = valor2;
		if (maior < valor3)
			maior = valor3;
		
		if (menor > valor2)
			menor = valor2;
		if (menor > valor3)
			menor = valor3;		
		
		System.out.println(maior);
		System.out.println(menor);
	}

}
