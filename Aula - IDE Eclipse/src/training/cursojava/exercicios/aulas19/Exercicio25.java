package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
     		vetorB[i] = (vetorA[i] % 2 == 0)? 1 : 0;						
		}
		/*for (int i = 0; i < vetorB.length; i++) {
			if (vetorA[i] % 2 == 0)
				vetorB[i] = 1;
			else
				vetorB[i] = 0;
		}*/
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
