package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		int[] A = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Elemento "+(i+1)+": ");
			A[i] = scan.nextInt();			
		}
		
		int soma = 0;
		
		System.out.print("Elemento: ");
		for (int i : A) {
			if (i % 5 == 0)
				soma += i;
			System.out.print(i+" ");
		}		
		System.out.println("Soma: "+soma);
		
		
	}

}
