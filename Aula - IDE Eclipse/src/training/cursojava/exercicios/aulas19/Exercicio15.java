package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		int[] A = new int[10];	
		Scanner scan = new Scanner(System.in);
		int par = 0, impar = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Elemento "+(i+1)+": ");
			A[i] = scan.nextInt();
			
			if ((A[i] % 2 ) == 0) 
				par++;
		}
		impar = A.length - par;
		
		int percentualPar = (par*100)/A.length;
		int percentualImpar = (impar*100)/A.length;
		
		System.out.println("Percentual Par: "+percentualPar+"% ");
		System.out.println("Percentual Impar: "+percentualImpar+"% ");
		

	}

}
