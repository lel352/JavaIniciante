package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor/Horas: ");
		double valor = scan.nextDouble();
		System.out.println("Horas/Mes: ");
		double horas = scan.nextDouble();
		
		double salario = valor*horas;
		System.out.println("Salario: "+salario);

	}
}
