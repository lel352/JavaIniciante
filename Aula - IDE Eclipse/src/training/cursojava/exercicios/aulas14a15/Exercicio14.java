package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Nota1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota2: ");
		double nota2 = scan.nextDouble();
		
		
		System.out.println("Nota1 "+nota1);
		System.out.println("Nota2 "+nota2);
		
		double media  = (nota1 + nota2) /2;
		System.out.println("Media "+media);
		if (media >= 9) 
			System.out.println("A - Aprovado ");
		else if (media >= 7.5)
			System.out.println("B - Aprovado");
		else if	(media >= 6)
			System.out.println("C - Aprovado");
		else if	(media >= 4)
			System.out.println("D - Reprovado");
		else 
			System.out.println("E - Reprovado");		
	}

}
