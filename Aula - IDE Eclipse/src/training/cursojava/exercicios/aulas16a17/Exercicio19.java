package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quatidade de notas: ");
		int numero = scan.nextInt();
		float soma = 0;
		for (int i = 0; i<numero; i++) {
			System.out.println("Numero "+(i+1)+": ");
			soma += scan.nextFloat();
		}
		float media = soma/numero;
		System.out.println("Media: "+media);
	}

}
