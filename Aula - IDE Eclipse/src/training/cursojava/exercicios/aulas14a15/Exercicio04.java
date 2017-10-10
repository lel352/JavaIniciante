package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Letra: ");
		String letra = scan.nextLine();
		
		if (letra.length() > 1) {
			System.out.println("Mais de uma letra, não é válido ");
		}
		else {
			switch (letra.toUpperCase()) {
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Vogal");
				break;
			default: System.out.println("Consoante");			
			}
		}
	}	
}
