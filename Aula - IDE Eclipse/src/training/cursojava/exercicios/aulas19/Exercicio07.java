package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A Numero "+(i+1)+": ");
			A[i] = scan.nextInt();
		}		
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("Vetor B Numero "+(i+1)+": ");
			B[i] = scan.nextInt();
			C[i] = A[i] - B[i];
		}		
				
		System.out.println("\nA");
		for (int i : A) {
			System.out.print(i+" ");
		}
				
		System.out.println("\nB");
		for (int i : B) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nC");
		for (int i : C) {
			System.out.print(i+" ");
		}
		
	}

}
