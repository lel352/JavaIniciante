package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Altura: ");
		double altura = scan.nextDouble();
		double peso = (72.7*altura)-58;
		System.out.println("Peso: "+peso);		
	}

}
