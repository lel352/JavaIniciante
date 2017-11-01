package training.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero de pessoas que serão intrevistadas? ");
		int numeroEntrevistados  = scan.nextInt();
		
		int qtdeFilhos;
		
		String[][] nomesFilhos = new String[numeroEntrevistados][];
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa "+(i+1)+" - Numero de Filhos? ");
			qtdeFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdeFilhos];
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Pessoa "+(i+1)+" - Nome do filho "+(j+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("pessoa "+(i+1)+" tem "+(nomesFilhos[i].length)+" filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.print(nomesFilhos[i][j]+" ");
			}
			System.out.println();
		}

	}

}
