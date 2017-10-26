package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		double[] A = new double[20];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cotação do dolar: ");
		double cotacao = scan.nextDouble();
		for (int i = 0; i < A.length; i++) {
			A[i] = cotacao * (i+1);
		}
		
		System.out.print("Cotação: ");
		for (double d : A) {
			System.out.print(d+" ");
		}
	}
}
