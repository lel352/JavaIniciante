package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor1: ");
		double valor1 = scan.nextDouble();
		System.out.println("Valor2: ");
		double valor2 = scan.nextDouble();
		System.out.println("Valor3: ");
		double valor3 = scan.nextDouble();		
		
		if ((valor1 >= valor2) && (valor1 >= valor3)) {
			System.out.println(valor1);
		} else if ((valor2 >= valor1) && (valor2 >= valor3)) {
			System.out.println(valor2);			
		} else if ((valor3 >= valor1) && (valor3 >= valor2)) {
			System.out.println(valor3);
		}
	}
}
