package training.cursojava.exercicios.aulas28a33;

import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		JogoVelhaNovo jogoVelha = new JogoVelhaNovo();
		
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");
		System.out.println();
		jogoVelha.imprimirTabuleiro();
		int linha, coluna;
		boolean validar = false;
		boolean vez = true;
		char sinal;
		boolean fim = false;
		
		do {
			if (vez) {
				System.out.println();
				System.out.println("Jogador 1 - X");
				sinal = 'X';				
			}
			else{
				System.out.println();
				System.out.println("Jogador 2 - O");
				sinal = 'O';
			}
			do {
				do {
					validar = true;
					System.out.println("Digite a linha: ");
					linha = scan.nextInt();
					if ((linha < 1) || (linha > 3)) {
						System.out.println("Linha inválida: ");
						validar = false; 
					}   
				}while(!validar); 	
				do {
					validar = true;
					System.out.println("Digite a coluna: ");
					coluna = scan.nextInt();
					if ((coluna < 1) || (coluna > 3)) {
						System.out.println("Coluna inválida: ");
						validar = false; 
					}   
				}while(!validar);
				validar = true;
				if (!jogoVelha.validarJogada(linha, coluna, sinal)) { 
					validar = false;
					System.out.println("Posição invalida !!! ");
					System.out.println("Já usada tem novamente !!! ");
				}	
			}while(!validar);
			
		    jogoVelha.imprimirTabuleiro();
		    fim = jogoVelha.verificaGanhador(sinal);
		    if (fim) {
		    	System.out.println("Vencendor foi: "+sinal);
		    } 
		    if (jogoVelha.getJogada() >= 9) {
		    	System.out.println("Jogo impatou!! ");
		    	fim = true;
		    }
			vez = !vez;
		}while(!fim);
	}
}
