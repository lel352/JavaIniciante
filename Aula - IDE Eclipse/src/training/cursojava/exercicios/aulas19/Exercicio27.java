package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
	
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] < 7)
				vetorB[i] = 'a';
			else if (vetorA[i] == 7)
				vetorB[i] = 'b';
			else if ((vetorA[i] > 7) && (vetorA[i] < 10))
				vetorB[i] = 'c';
			else if (vetorA[i] == 10)
				vetorB[i] = 'd';
			else if (vetorA[i] > 10)
				vetorB[i] = 'e';
		}
		
		System.out.print("\nA ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}		
		System.out.print("\nB ");
		for (char i : vetorB) {
			System.out.print(i+" ");
		}

	}

}
