package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Último termo: ");
		int ntermo = scan.nextInt();
		double soma = 0;
		System.out.print("s = ");
		for (int i = 1, j = 1 ; i <= ntermo; i++,j+=2) {
			if (i > 1)
				System.out.print(" + ");
			System.out.print(i+"/"+j);
			soma += (double) i/j; 
		}		
		System.out.println(" = "+soma);
	}
}
