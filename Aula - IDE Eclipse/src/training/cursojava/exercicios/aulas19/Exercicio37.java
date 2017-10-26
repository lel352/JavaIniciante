package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		double[] vetorB = new double[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = 1;
			for (int j = vetorA[i]; j > 1; j--) {
				vetorB[i] *= j;
			}			
			/*vetorB[i] = vetorA[i];
			for (int j = 2; j < vetorA[i]; j++) {
				vetorB[i] *= j;
			}*/
		}
		
		System.out.print("\nA ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}			
		System.out.println("\nB ");
		for (double d : vetorB) {
			System.out.println(d+" ");
		}	
	}
}
