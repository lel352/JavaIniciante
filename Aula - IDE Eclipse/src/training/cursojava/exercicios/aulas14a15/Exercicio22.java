package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Kg Morango ");
		double kgMorango = scan.nextDouble();
		System.out.println("Kg maçã ");
		double kgMaca = scan.nextDouble();
		
		double totalMorango = 0;
		double totalMaca = 0;
		
		if (kgMorango <= 5) {
			totalMorango = kgMorango * 2.50;	
		}
		else {
			totalMorango = kgMorango * 2.20;
		}
		
		if (kgMaca <= 5) {
			totalMaca = kgMaca * 1.80;	
		}
		else {
			totalMaca = kgMaca * 1.50;
		}
			
		double total = totalMaca +totalMorango; 
		
		
		if (((kgMorango+kgMaca) > 8) || (total > 25)) {
			double desconto = (total*10)/100;
			total = total -desconto;
		}
		
		System.out.println("Valor pago: "+total);		
	}

}
