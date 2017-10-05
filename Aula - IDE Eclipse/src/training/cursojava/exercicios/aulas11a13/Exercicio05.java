package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Metros: ");
		double metro = scan.nextDouble();
		double cem = metro * 100;
		
		System.out.println("Cemtimentros: "+cem);
	}
}
