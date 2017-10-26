package training.cursojava.exercicios.aulas19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[15];
		double[] B = new double[A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Numero "+(i+1)+": ");
			A[i] = scan.nextInt();	
			B[i] = Math.sqrt(A[i]);
		}
		
		System.out.println("\nA");
		for (int i : A) {
			System.out.print(i+" ");
		}
				
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("\nB");
		for (double i : B) {
			System.out.print(df.format(i)+" ");
		}

	}

}
