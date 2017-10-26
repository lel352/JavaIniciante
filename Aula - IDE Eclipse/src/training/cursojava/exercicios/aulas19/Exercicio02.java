package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[8];
		int[] B = new int[8];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Numero "+(i+1)+": ");
			A[i] = scan.nextInt();	
			B[i] = A[i]*2;
		}
		System.out.println("\nA");
		for (int i : A) {
			System.out.print(i+" ");
		}	
		
		
		System.out.println("\nB");
		for (int i : B) {
			System.out.print(i+" ");
		}
		

	}

}
