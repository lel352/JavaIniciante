package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("N-�simo: ");
		int n = scan.nextInt();
		int fibonaci = 1;
		int antes = 0;
		int valor = 0;
		for (int i = 1; i < n; i++ ) {		 
			valor = antes + fibonaci;
			antes = fibonaci;
			fibonaci = valor;	
			System.out.print(fibonaci+",");
		}
		System.out.println("\nResultado: "+fibonaci);
	}
}
