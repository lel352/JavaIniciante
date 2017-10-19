package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeiro numero");
		int numero1 = scan.nextInt();
		System.out.println("Segundo numero");
		int numero2 = scan.nextInt();
		for (int i = numero1; i <= numero2; i++ ) {
			System.out.println(i);
		}

	}

}
