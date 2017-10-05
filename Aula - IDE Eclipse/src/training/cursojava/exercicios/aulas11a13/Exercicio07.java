package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		System.out.println("Dblo da area: "+(area *2));

	}

}
