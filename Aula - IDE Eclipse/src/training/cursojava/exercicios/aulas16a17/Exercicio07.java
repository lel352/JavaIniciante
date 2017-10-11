package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Numero "+(i+1)+": ");
			numero = scan.nextInt();
			maior = (numero > maior)?numero:maior;			
		}
		System.out.println("Maior numero: "+maior);

	}

}
