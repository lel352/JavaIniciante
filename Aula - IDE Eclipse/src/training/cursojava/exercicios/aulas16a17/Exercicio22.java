package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade de CDs: ");
		int cds = scan.nextInt();
		double preco = 0;
		for (int i = 0; i < cds; i++) {
			System.out.println("CD "+(i+1)+" Preço: ");
			preco += scan.nextDouble();
		}			
		double media = preco/cds;		
		System.out.println("Media de valor dos CDs: "+media);
	}
}
