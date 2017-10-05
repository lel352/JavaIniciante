package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		final double pi = 3.14;
		Scanner scan = new Scanner(System.in);
		System.out.println("Rario: ");
		double raio = scan.nextFloat();
		double area = Math.pow(raio,2)*pi;
		System.out.println("Area do circulo é "+area);
	}
}
