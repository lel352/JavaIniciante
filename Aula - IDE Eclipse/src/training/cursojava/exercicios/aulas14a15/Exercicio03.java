package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Sexo: ");
		String sexo = scan.nextLine();
		
		if (sexo.toUpperCase().equals("F")) {
			System.out.println("Feminino");
		}
		else if (sexo.toUpperCase().equals("M")) {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Sexo Invalido!!");
		}
			
			
		

	}

}
