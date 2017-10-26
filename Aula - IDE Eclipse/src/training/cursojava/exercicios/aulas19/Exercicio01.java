package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Numero "+(i+1)+": ");
			A[i] = scan.nextInt();
			B[i] = A[i];
		}		
		
		System.out.println("B");
		for (int i : B) {
			System.out.println(i);
		}	
		
		for (int i = 0; i < A.length; i++) {
			A[i] = i*5;
		}
		
		B = A.clone();
		System.out.println("B");
		for (int i : B) {
			System.out.println(i);
		}
		A[0] = 5;
		
		System.out.println("B");
		for (int i : B) {
			System.out.println(i);
		}
		
		B = A.clone();
		System.out.println("B");
		for (int i : B) {
			System.out.println(i);
		}

	}

}
