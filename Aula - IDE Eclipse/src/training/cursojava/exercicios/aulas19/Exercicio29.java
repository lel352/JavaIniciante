package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length*2];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
			vetorC[i] = vetorA[i];
			
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("B - Numero "+(i+1)+": ");
			vetorB[i] = scan.nextInt();
			vetorC[vetorB.length+i] = vetorB[i];
		}
		
		/*for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];			
		} 
		int tamanho = vetorB.length;
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[tamanho+i] = vetorB[i];			
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
