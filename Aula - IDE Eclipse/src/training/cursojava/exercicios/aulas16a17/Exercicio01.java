package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota = 0;
		
		do {
			System.out.println("Nota: ");
			nota = scan.nextDouble();
			if (nota < 0 || nota>10)
				System.out.println("Nota inválida !!! ");				
			
		} while (nota < 0 || nota >10); 
		System.out.println("Saiu !!! ");				
	}
}
