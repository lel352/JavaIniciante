package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Pre�o do P�o: R$ ");
		double pao = scan.nextDouble();
		System.out.println("\nPanificadora P�o de ontem - Tabela de Pre�os");				
		double valor = 0;
		for (int i = 1; i <= 50; i++) {
			valor += pao;
			System.out.println((i+1)+" - "+valor);
		}
		//ou
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - R$ "+(i*pao));
		}
	}

}
