package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Numero "+(i+1)+": ");
			numero = scan.nextInt();
			soma += numero;			
		}
		double media = (double) soma/5; 
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);
		

	}

}
