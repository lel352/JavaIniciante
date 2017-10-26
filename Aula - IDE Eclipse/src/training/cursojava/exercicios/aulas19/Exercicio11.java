package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int par= 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A Numero "+(i+1)+": ");
			A[i] = scan.nextInt();
			if (A[i] % 2 == 0)
				par++;
		}	
		System.out.println("Quantidade de pares: "+par);
		
	}
}
