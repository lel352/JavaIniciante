package training.cursojava.exercicios.aulas27;

import java.util.Scanner;

public class Jogovelha {
	char[][] jogoVelha = new char[3][3];
	
	boolean fim = false;
			
	int jogada = 0;
	
	public Jogovelha() {
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < jogoVelha.length; j++) {
				jogoVelha[i][j] = '_';
			}
		}
		mostrarJogo();
	}
		
	void mostrarJogo() {
		System.out.println("Coluna  1 2 3");
		for (int i = 0; i < jogoVelha.length; i++) {
			System.out.print("linha "+(i+1)+" ");
			for (int j = 0; j < jogoVelha.length; j++) {
				if (j == jogoVelha.length-1)
				   System.out.print(jogoVelha[i][j]);
				else	
				   System.out.print(jogoVelha[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	void verificaVencedor() {
		 char vencedor = '0';
		 if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||     //linha 1
                 (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //linha 2
                 (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha 3
                 (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //coluna 1
                 (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna 2
                 (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //coluna 3
                 (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || //diagonal
                 (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){  //diagonal inversa
             fim = true;
             vencedor = 'X';
         } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||     //linha 1
                 (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || //linha 2
                 (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //linha 3
                 (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //coluna 1
                 (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //coluna 2
                 (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //coluna 3
                 (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || //diagonal
                 (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){  //diagonal inversa
         	fim = true;
             vencedor = 'O';
         } else if (jogada >= 9){
             fim = true;	 
             vencedor = '1';
         }
		 
		if (vencedor == '1')
			 System.out.println("Sem Vencedor");
		else if (vencedor == 'X' || vencedor == 'O')
			System.out.println("Vencendor foi: "+vencedor);
		
	}
	
	void iniciar() {
		Scanner scan = new Scanner(System.in);
		int linha, coluna;
		boolean validar = false;
		boolean vez = true;
		char sinal;
	
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
				if ((jogoVelha[linha-1][coluna-1] == 'X') || (jogoVelha[linha-1][coluna-1] == 'O')){
					validar = false;
					System.out.println("Posição invalida !!! ");
					System.out.println("Já usada tem novamente !!! ");
				}	
			}while(!validar);
			
			jogoVelha[linha-1][coluna-1] = sinal;
			jogada++;
			vez = !vez;
			
			mostrarJogo();
			verificaVencedor();
						
		}while(!fim); 				
	}
}
