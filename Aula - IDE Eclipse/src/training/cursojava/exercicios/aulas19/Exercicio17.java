package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int qtde = 0;
	
		for (int i = 0; i < A.length; i++) {
			System.out.println("idade "+(i+1)+": ");
			A[i] = scan.nextInt();
		}
		
		for (int i : A) {
			if (i > 35)
				qtde++;
		}	
		
		System.out.println("Quantidade de pessoas com pessoas maior que 35: "+qtde);

	}

}
