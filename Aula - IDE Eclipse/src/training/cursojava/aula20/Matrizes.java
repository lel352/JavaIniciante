package training.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
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
		
		for (int i = 0; i < alunosNotas.length; i++) {
			//System.out.println(alunosNotas[i]);
			for (int j = 0; j < alunosNotas[i].length; j++) {
				System.out.print(alunosNotas[i][j]+" ");				
			}
			System.out.println();
		}
		System.out.println();
		alunosNotas[1][3] = 8; 
		for (int i = 0; i < alunosNotas.length; i++) {
			//System.out.println(alunosNotas[i]);
			for (int j = 0; j < alunosNotas[i].length; j++) {
				System.out.print(alunosNotas[i][j]+" ");				
			}
			System.out.println();
		}
		
		double soma=0;
		double media;
		System.out.println("Calculando a media");
		for (int i = 0; i < alunosNotas.length; i++) {
			soma=0;
			for (int j = 0; j < alunosNotas[i].length; j++) {
				soma +=alunosNotas[i][j];				
			}
			System.out.println("Média do aluno "+i+" é = "+(soma/4));
		}
		
		double[] notas = {7,8,9,10};
		double[][] notasAlunos2 = {{1,3,4,5},{10,5,6,8}};
		
		System.out.println(" Notas alunos 2");
		for (int i = 0; i < notasAlunos2.length; i++) {
			for (int j = 0; j < notasAlunos2[i].length; j++) {
				System.out.print(notasAlunos2[i][j]+" ");				
			}
			System.out.println();
		}

	}

}
