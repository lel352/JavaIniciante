package training.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int [] notas =  new int[10];
		Random random = new Random();
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);			
		}
		// for normal
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i]+" ");
			
		}		
		
		//for each 
		System.out.println();
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		//Exemplo com arrays multidimensionais // Matriz 
		double[][]  alunosNotas = new double[3][4];//alunos x notas alunosNotas.length = 3;  alunosNotas[i].length = 4
		
		alunosNotas[0][0] = 10;
		alunosNotas[0][1] = 7;
		alunosNotas[0][2] = 8;
		alunosNotas[0][3] = 9.5;
		
		alunosNotas[1][0] = 9;
		alunosNotas[1][1] = 8;
		alunosNotas[1][2] = 7;
		alunosNotas[1][3] = 9;
		
		alunosNotas[2][0] = 8;
		alunosNotas[2][1] = 9;
		alunosNotas[2][2] = 10;
		alunosNotas[2][3] = 7;
		
		for (double[] notasAluno : alunosNotas) {
			for (double nota : notasAluno) {
				System.out.print("nota: "+nota);
			}
			System.out.println();
		}
	}
}
