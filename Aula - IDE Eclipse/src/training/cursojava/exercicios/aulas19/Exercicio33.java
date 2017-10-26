package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Numero "+(i+1)+": ");
			vetorA[i] = scan.nextInt();
		}
		int cont;
		boolean flag;		
		for (int i : vetorA) {
			cont = i-1;
			flag = false;
			while (cont > 1) {
				if (i % cont == 0) {
					System.out.print("\nNumero "+i+" não é Primo");
					flag = true;
					break;				
				}
				cont--;
			}
			if (!flag) {
				System.out.print("\nNumero "+i+" é número Primo");
			}
		}
	}
}
