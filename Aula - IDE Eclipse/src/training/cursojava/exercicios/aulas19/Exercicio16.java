package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int igual = 0;
		int qtde15 = 0; 
		int somaMenor = 0;
		int somaMaior = 0;		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Elemento "+(i+1)+": ");
			A[i] = scan.nextInt();
		}
		
		for (int i : A) {
			if (i == 15)
				igual++;
			else if (i< 15)
				somaMenor += i;
			else {
				qtde15++;
				somaMaior += i;
			}	
		}
		
		double media = (double) somaMaior/qtde15;
		
		System.out.println("Quantidade de elementos igual 15: "+igual);
		System.out.println("Soma de elementos menor que 15: "+somaMenor);
		System.out.println("Media de elementos maior que 15: "+media);
	}
}
