package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inteiro 1: ");
		int inteiro1 = scan.nextInt();
		System.out.println("inteiro 2: ");
		int inteiro2 = scan.nextInt();
		System.out.println("real: ");
		double real = scan.nextDouble();
		
		double resultado =  ((inteiro1*2)*(inteiro2/2)); 
		System.out.println("A) "+resultado);
		resultado = ((inteiro1*3)+real);
		System.out.println("B) "+resultado);
		System.out.println("C) "+Math.pow(real, 3));
	}

}
