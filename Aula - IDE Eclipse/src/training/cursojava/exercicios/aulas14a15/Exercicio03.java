package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Sexo: ");
		String sexo = scan.nextLine();
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}
		else if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Sexo Invalido!!");
		}
			
			
		

	}

}
