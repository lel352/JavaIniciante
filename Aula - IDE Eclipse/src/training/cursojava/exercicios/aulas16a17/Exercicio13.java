package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Base: ");
		int base = scan.nextInt();
		System.out.println("Expoente: ");
		int expo = scan.nextInt();
		int potencia = 1;
		
		for (int i = 0; i < expo; i++) {
			potencia = potencia*base;	
		}
		System.out.println("Total: "+potencia);

	}

}
