package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Nota1: ");
		double valor1 = scan.nextDouble();
		System.out.println("Nota2: ");
		double valor2 = scan.nextDouble();
		
		double media = (valor1+valor2)/2;
		if (media == 10) {
			System.out.println("Aprovado com distinção!");	
		}else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
