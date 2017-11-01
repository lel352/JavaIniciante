package training.cursojava.exercicios.aulas20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] M = new int[10][10];
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(10);
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
		int numero = 5;
		int maior = M[numero][0];
		int menor = maior;
		for (int i = 0; i < M[numero].length; i++) {
			maior = (M[numero][i]>maior)?M[numero][i]:maior;
			menor = (M[numero][i]<menor)?M[numero][i]:menor;
		}
		
		System.out.println("Linha 5 maior é :"+maior);
		System.out.println("Linha 5 menor é :"+menor);
		
		numero = 7;
		maior = M[0][numero];
		menor = maior;
		for (int i = 0; i < M.length; i++) {
			maior = (M[i][numero]>maior)?M[i][numero]:maior;
			menor = (M[i][numero]<menor)?M[i][numero]:menor;
		}
		
		System.out.println("Coluna 7 maior é :"+maior);
		System.out.println("Coluna 7 menor é :"+menor);

	}

}
