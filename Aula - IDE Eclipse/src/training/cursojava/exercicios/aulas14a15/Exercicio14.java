package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Nota1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota2: ");
		double nota2 = scan.nextDouble();
		char aproveitamento;
		
		
		System.out.println("Nota1 "+nota1);
		System.out.println("Nota2 "+nota2);
		
		double media  = (nota1 + nota2) /2;
		System.out.println("Media "+media);
		if (media >= 9) 
			aproveitamento = 'A';
		else if (media >= 7.5)
			aproveitamento = 'B';
		else if	(media >= 6)
			aproveitamento = 'C';
		else if	(media >= 4)
			aproveitamento = 'D';
		else 
			aproveitamento = 'E';
		
		System.out.println("Conceito "+aproveitamento);
		switch (aproveitamento) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Aprovado");
			break;
		case 'D':
		case 'E':
			System.out.println("Reprovado");
			break;
		}
		
	}

}
