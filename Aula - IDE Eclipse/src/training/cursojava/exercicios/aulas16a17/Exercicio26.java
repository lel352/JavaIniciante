	package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Fatorial de: ");
		int f = scan.nextInt();
		System.out.print(f+"! = "+f);
		int valor = f;
		for (int i = (f-1); i > 0; i--) {
			valor *= i;
			System.out.print(" . "+i);			
		}
		System.out.print(" = "+valor);

	}

}
