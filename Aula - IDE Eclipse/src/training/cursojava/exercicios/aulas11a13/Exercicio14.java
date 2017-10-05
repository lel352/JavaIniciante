package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tamanho (Mega): ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Velocidade Internet (Mega): ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / velocidadeInternet;
		
		System.out.println("Tempo de download: " + tempo);

	}

}
