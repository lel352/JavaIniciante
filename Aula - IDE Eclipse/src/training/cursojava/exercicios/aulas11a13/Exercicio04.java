package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nota1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota2: ");
		double nota2 = scan.nextDouble();
		System.out.println("Nota3: ");
		double nota3 = scan.nextDouble();
		System.out.println("Nota4: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Media: "+media);
	}

}
