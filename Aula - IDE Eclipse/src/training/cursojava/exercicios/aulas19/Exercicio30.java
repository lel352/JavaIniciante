package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; //par
		int[] vetorC = new int[vetorA.length]; // impar
		
		byte par = 0, impar = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				vetorB[par] = vetorA[i];
				par++;
			}
			else {
				vetorC[impar] = vetorA[i];
				impar++;
			} 
		}
		
		System.out.print("\nA ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}		
		System.out.print("\nB ");
		for (int i = 0; i < par; i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.print("\nC ");
		for (int i = 0; i < impar; i++) {
			System.out.print(vetorC[i]+" ");
		}

	}

}
