package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double populacaoA;
		double populacaoB;
		double percentualA;
		double percentualB;
		int ano = 0;
		boolean flag = true;
		boolean invalido = false;
		int resposta = 0;

		while (flag) {
			do {
				ano = 0; 
				System.out.println("Popula��o A: ");
				populacaoA = scan.nextDouble();
				if (populacaoA > 0)
					invalido = true;
				else
					System.out.println("Popula��o N�o pode ser 0 !!!");
			} while(!invalido);	
			
			invalido = false;
			do {
				
				System.out.println("Percentual de crescimento Popula��o A: ");
				percentualA = scan.nextDouble();
				if (percentualA > 0)
					invalido = true;
				else
					System.out.println("Percentual N�o pode ser 0 !!!");
			} while(!invalido);
			
			invalido = false;
			do {
			
				System.out.println("Popula��o B: ");
				populacaoB = scan.nextDouble();
				if (populacaoB > 0)
					invalido = true;
				else
					System.out.println("Popula��o N�o pode ser 0 !!!");				
			} while(!invalido);	
			
			invalido = false;
			do {
				System.out.println("Percentual de crescimento Popula��o B: ");
				percentualB = scan.nextDouble();
				if (populacaoB > 0) {
					if (percentualB > percentualA)
						System.out.println("Se percetual B n�o pode ser maior que A");
					else 
						invalido = true;					
				}else
					System.out.println("Popula��o N�o pode ser 0 !!!");
				
			} while(!invalido);

			System.out.println(" Inicial Popula��o A: " + populacaoA + " percentual " + percentualA);
			System.out.println(" Inicial Popula��o B: " + populacaoB + " percentual " + percentualB);
			while (populacaoA < populacaoB) {
				ano++;
				populacaoA += ((populacaoA * percentualA) / 100);
				populacaoB += ((populacaoB * percentualB) / 100);
			}
			System.out.println(" Ap�s " + ano + " anos");
			System.out.println(" Popula��o A: " + populacaoA);
			System.out.println(" Popula��o B: " + populacaoB);

			System.out.println("Refazer os calculos ? 1-sim 2-n�o");
			resposta = scan.nextInt();
			if (resposta == 2)
				flag = false;
		}
		System.out.println("Fim de programa!!");

	}
}
