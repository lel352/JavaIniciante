package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Farenheit: ");
		double farenheitn = scan.nextDouble();
		double celcius = (5*(farenheitn-32)/9);
		System.out.println("Celcio: "+celcius);
	}

}
