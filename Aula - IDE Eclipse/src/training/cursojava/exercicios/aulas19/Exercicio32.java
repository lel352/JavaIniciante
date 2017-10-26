package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i : vetorA) {
			System.out.println("\nTabuada de "+i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}			
		}
	}

}
