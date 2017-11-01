package training.cursojava.exercicios.aulas20;

import java.util.Random;

public class Exercicio01 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] M = new int[4][4];
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(10);
			}
		}
		
		int maior = 0;
		int[] pos = new int[2]; 
		
		for (int i = 0; i < M.length; i++) {
			//System.out.println(alunosNotas[i]);
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j]+" ");
				if (maior < M[i][j]) {
					maior = M[i][j];
					pos[0] = i;
					pos[1] = j;
				}					
			}
			System.out.println();
		}
		
		System.out.println("Maior número é: "+maior);
		System.out.println("Posição: "+pos[0]+" "+pos[1]);
	}
}
