package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		int[] A = new int[10];	
		Scanner scan = new Scanner(System.in);
		int elemento = 0;
		int soma = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Elemento "+(i+1)+": ");
			A[i] = scan.nextInt();
			
			if ((A[i] % 2 ) != 0) {
				elemento++;
				soma += A[i];
			}	
		}
		
		double media = (double) soma/elemento;
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);
		
	}

}
