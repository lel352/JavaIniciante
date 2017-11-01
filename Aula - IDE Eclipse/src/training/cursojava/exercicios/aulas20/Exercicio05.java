package training.cursojava.exercicios.aulas20;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		String[][][] mesDiasCompromisos = new String[12][30][8];
		Scanner scan = new Scanner(System.in);
		int res = 0;
		int dia = 0;
		int hora = 0;
		int mes = 0;
		boolean resValido = true; 
		do {
			System.out.println("- Menu - ");
			System.out.println("1 - Informar compromisso");
			System.out.println("2 - Consultar Compromisso ");
			System.out.println("0 - sair ");
			do {
				resValido = true;
				System.out.print("Digite sua opção: ");
				res = scan.nextInt();
				if ((res < 0) || (res > 2)) {
					System.out.println("opção invalida!!! ");
					resValido = false;
				} 
			}while(!resValido);
			
			switch (res) {
			case 1:
				System.out.println("- Informando Compromisso -");
				do {
					resValido = true;					
					System.out.print("Diga o Mes: ");
					mes = scan.nextInt();
					if ((mes < 1) || (mes > 12)) {
						System.out.println("- Mês invalido (1-12) -");
						resValido = false;
					}
				}while(!resValido);
				do {
					resValido = true;					
					System.out.print("Diga a dia: ");
					dia = scan.nextInt();
					if ((dia < 1) || (dia > 30)) {
						System.out.println("- Dia invalido (1-30) -");
						resValido = false;
					}
				}while(!resValido);
				do {
					resValido = true;					
					System.out.print("Diga a hora: ");
					hora = scan.nextInt();
					if ((hora < 1) || (hora > 8)) {
						System.out.println("- Dia invalido (1-8) -");
						resValido = false;
					}
				}while(!resValido);
				scan.nextLine();
				System.out.println("informe o Compromisso mês "+mes+" do "+dia+" na hora "+hora+": ");
				mesDiasCompromisos[mes-1][dia-1][hora-1] = scan.nextLine();
				System.out.println();
				break;
			case 2:
				System.out.println("- Buscando Compromisso -");
				do {
					resValido = true;					
					System.out.print("Diga a Mês: ");
					mes = scan.nextInt();
					if ((mes < 1) || (mes > 12)) {
						System.out.println("- Mês invalido (1-12) -");
						resValido = false;
					}
				}while(!resValido);
				do {
					resValido = true;					
					System.out.print("Diga a dia: ");
					dia = scan.nextInt();
					if ((dia < 1) || (dia > 30)) {
						System.out.println("- Dia invalido (1-30) -");
						resValido = false;
					}
				}while(!resValido);
				do {
					resValido = true;					
					System.out.print("Diga a hora: ");
					hora = scan.nextInt();
					if ((hora < 1) || (hora > 8)) {
						System.out.println("- Dia invalido (1-8) -");
						resValido = false;
					}
				}while(!resValido);
				System.out.println("informando o Compromisso do "+dia+" na hora "+hora+": ");
				if (("").equals(mesDiasCompromisos[mes-1][dia-1][hora-1]) || (mesDiasCompromisos[mes-1][dia-1][hora-1]) == null)
					mesDiasCompromisos[mes-1][dia-1][hora-1] = "Sem Compromisso";
				
				System.out.println(mesDiasCompromisos[mes-1][dia-1][hora-1]);
				scan.nextLine();
				System.out.println();
				break;

			default:
				break;
			} 
		}while(res != 0);

	}

}
