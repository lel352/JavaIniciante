package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Tabuada de: ");
		int numero = scan.nextInt();
		while (numero<1 || numero>10) {
			System.out.println("Valor inválido!\nDigite um novo valor: ");
			numero = scan.nextInt();
		}
		
		System.out.println("Tabuada de "+numero+": ");
		for (int i = 0; i < 11; i++) {
			System.out.println(numero+" X "+i+" = "+(i*numero));
		}

	}

}
