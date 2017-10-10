package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Turno estuda: ");
		String turno = scan.nextLine();
		
		switch (turno.toUpperCase()) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Bom Noite!");
			break;

		default:
			System.out.println("Valor inválido!");
			break;
		}
	}

}
