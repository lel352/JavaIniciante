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
		int resposta = 0;

		while (flag) {
			do {
				ano = 0; 
				System.out.println("População A: ");
				populacaoA = scan.nextDouble();
				System.out.println("Percentual de crescimento População A: ");
				percentualA = scan.nextDouble();
				System.out.println("População B: ");
				populacaoB = scan.nextDouble();
				System.out.println("Percentual de crescimento População B: ");
				percentualB = scan.nextDouble();
				if (percentualB > percentualA)
					System.out.println("Se percetual B não pode ser maior que A");

			} while (percentualB >= percentualA);

			System.out.println(" Inicial População A: " + populacaoA + " percentual " + percentualA);
			System.out.println(" Inicial População B: " + populacaoB + " percentual " + percentualB);
			while (populacaoA < populacaoB) {
				ano++;
				populacaoA = populacaoA + ((populacaoA * percentualA) / 100);
				populacaoB = populacaoB + ((populacaoB * percentualB) / 100);
			}
			System.out.println(" Após " + ano + " anos");
			System.out.println(" População A: " + populacaoA);
			System.out.println(" População B: " + populacaoB);

			System.out.println("Refazer os calculos ? 1-sim 2-não");
			resposta = scan.nextInt();
			if (resposta == 2)
				flag = false;
		}
		System.out.println("Fim de programa!!");

	}
}
