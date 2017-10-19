package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero Pessoas: ");
		int numero = scan.nextInt();
		int idade = 0;
		for (int i = 0; i < numero; i++) {
			System.out.println("Idade: ");
			idade += scan.nextInt(); 
		}
		int media = idade/numero;
		if ((media >= 0) && (media <= 25)) {
			System.out.println("Media: "+media+" - Jovem");
		}
		else if ((media >= 26) && (media <= 60)) {
			System.out.println("Media: "+media+" - Adulta");
		}
		else {
			System.out.println("Media: "+media+" - Idosa");
		}		
	}
}
