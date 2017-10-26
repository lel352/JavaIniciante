package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[11];
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2,i);
		}
		
		for (double d : vetorA) {
			System.out.println(d);
		}
	}

}
