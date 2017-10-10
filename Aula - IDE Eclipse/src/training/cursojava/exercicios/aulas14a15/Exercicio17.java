package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Ano: ");
		int ano = scan.nextInt();
		
		double mod = ano % 4;
		if (mod != 0) {
			System.out.println(ano+" não é bissexto");
		} 
		else {
			mod = ano % 100;
			if (mod != 0) {
				System.out.println(ano+" é bissexto");				
			}
			else {
				mod = ano % 400;
				if (mod == 0) {
					System.out.println(ano+" é bissexto");
				}
				else {
					System.out.println(ano+" não é bissexto");
				}
					
			}
		}
		

	}

}
