package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("B - Numero "+(i+1)+": ");
			vetorB[i] = scan.nextInt();
			if (vetorA[i] > vetorB[i])
				vetorC[i] = 1;
			else if (vetorA[i] == vetorB[i])
				vetorC[i] = 0;
			else	
				vetorC[i] = -1;
		}
		
/*		for (int i = 0; i < vetorC.length; i++) {
			if (vetorA[i] > vetorB[i])
				vetorC[i] = 1;
			else if (vetorA[i] == vetorB[i])
				vetorC[i] = 0;
			else	
				vetorC[i] = -1;
		}*/
		
		System.out.print("\nA ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}		
		System.out.print("\nB ");
		for (int i : vetorB) {
			System.out.print(i+" ");
		}
		System.out.print("\nC ");
		for (int i : vetorC) {
			System.out.print(i+" ");
		}

	}

}
