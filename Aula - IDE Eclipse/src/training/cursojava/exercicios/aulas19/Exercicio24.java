package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanho = 10;
		int[] vetorA = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
		}
		boolean flag = true;
		for (int i = 0, j = (tamanho-1); i < (tamanho/2); i++, j--) {
			if (vetorA[i] != vetorA[j]) {
				flag = false;
				break;
			}			
		}
		
		if (flag)
			System.out.println("O vetor é um palindromo!!");
		else
			System.out.println("O vetor não é um palindromo!!");

	}

}
