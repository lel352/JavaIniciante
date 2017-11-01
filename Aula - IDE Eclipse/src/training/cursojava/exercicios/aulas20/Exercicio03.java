package training.cursojava.exercicios.aulas20;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] M = new int[3][3];
		int par = 0;
		int impar = 0;
		impar = M.length*M[0].length;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("Posição("+i+","+j+"): ");
				M[i][j] = scan.nextInt();
			}
		}		
		System.out.println("\n Matriz");
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j]+" ");
				if (M[i][j] %  2 == 0)
					par++;
				//else
					//impar++
			}
			System.out.println();
		}
		
		impar -= par; 
		
		System.out.println("Quantidade de par "+ par);
		System.out.println("Quantidade de Impar "+ impar);
	}

}
