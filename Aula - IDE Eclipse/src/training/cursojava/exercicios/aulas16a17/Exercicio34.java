package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Último termo: ");
		int ntermo = scan.nextInt();
		double soma = 0;
		System.out.print("H = ");
		for (int i = 1; i <= ntermo; i++) {
			if (i > 1)
				System.out.print(" + ");
			System.out.print("1/"+i);
			soma += (double) 1/i; 
		}		
		System.out.println(" = "+soma);
	}

}
