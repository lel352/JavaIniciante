package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Salario: ");
		double salario = scan.nextDouble();
		double percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		} else if ((salario > 280) && (salario < 700)){
			percentual = 15;			
		} else if ((salario >= 700) && (salario < 1500)){
			percentual = 10;
		} else if (salario >= 1500) {
			percentual = 5;
		}
		double aumento = (salario*percentual)/100; 
		double novoSalario = salario + aumento; 
		System.out.println("Salario: "+salario);
		System.out.println("Percentual: "+percentual+"%");
		System.out.println("Aumento: "+aumento);
		System.out.println("Novo Salario: "+novoSalario);
	}
}
