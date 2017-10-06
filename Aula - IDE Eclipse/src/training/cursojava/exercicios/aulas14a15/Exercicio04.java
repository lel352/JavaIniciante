package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Letra: ");
		String letra = scan.nextLine();
		
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
