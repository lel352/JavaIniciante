package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
			if (i % 2 != 0) {
				break;
			}			
		}
	}

}
