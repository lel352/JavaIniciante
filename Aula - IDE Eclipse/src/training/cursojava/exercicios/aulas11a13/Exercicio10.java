package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Celcio: ");
		double celcius = scan.nextDouble();
		double farenheitn = (1.8*celcius)+32;
		System.out.println("Farenheit: "+farenheitn);
	}
}
