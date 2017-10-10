package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		if ((numero % 2) == 0)
			System.out.println(numero+" é par");
		else
			System.out.println(numero+" é Impar");
		

	}

}
