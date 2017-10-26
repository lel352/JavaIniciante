package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorNotas1 = new double[10];
		double[] vetorNotas2 = new double[vetorNotas1.length];
		double[] vetorResultados = new double[vetorNotas1.length];
		for (int i = 0; i < vetorNotas1.length; i++) {
			System.out.println("Aluno "+(i+1));
			System.out.println("Nota 1 :");
			vetorNotas1[i] = scan.nextDouble();
			System.out.println("Nota 2 :");
			vetorNotas2[i] = scan.nextDouble();
			
			vetorResultados[i] = (vetorNotas1[i] + vetorNotas2[i])/2;
		}
		System.out.println("**********************************");
		for (int j = 0; j < vetorResultados.length; j++) {
			System.out.println("----Aluno "+(j+1)+"-----");
			System.out.println("Nota 1: "+vetorNotas1[j]);
			System.out.println("Nota 2: "+vetorNotas2[j]);
			System.out.println("Media: "+vetorResultados[j]);
			if (vetorResultados[j] > 7) {
				System.out.println("Aprovado!");
			}
			else {
				System.out.println("Reprovado!");
			}		
			System.out.println("--------------------------------");
		}
		System.out.println("**********************************");
	}

}
