package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade de turmas: ");
		int turmas = scan.nextInt();
		int soma = 0, aluno; 
		
		for (int i = 0; i < turmas; i++) {
			System.out.println("Quantidade de Alunos - Turmas "+(i+1)+": ");
			aluno = scan.nextInt();
			while(aluno > 40 || aluno <= 0) {
				System.out.println("Quantidade de alunos inválida");
				System.out.println("Quantidade de Alunos - Turmas"+(i+1)+": ");
				aluno = scan.nextInt();				
			}
			soma += aluno;
		}
		int media = soma/turmas;
		System.out.println("Media de Alunos por tumas: "+media);		
	}
}
