package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		byte cont = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				vetorB[cont] = vetorA[i];
				cont++;
			}
		}
	    
     	for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				vetorB[cont] = vetorA[i];
				cont++;
			}
	    }
     	
     	System.out.print("\nA ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}		
		System.out.print("\nB ");
		for (int i : vetorB) {
			System.out.print(i+" ");
		}
	}
}
