package training.cursojava.exercicios.aulas20;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		char[][] jogoVelha = new char[3][3];
		Scanner scan = new Scanner(System.in);
		boolean fim = false;
		boolean validar = false;
		char vencedor;
		char sinal;
		int linha, coluna;
		boolean vez = true;
		int jogada=0;
		
		System.out.println("Jogador 1 - X");
		System.out.println("Jogador 2 - O");
		System.out.println();
		System.out.println("--- Jogo da Velha ---");
		System.out.println("Coluna  1 2 3");
		System.out.println("linha 1 _|_|_");
		System.out.println("linha 2 _|_|_");
		System.out.println("linha 3  | |  ");

		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < jogoVelha.length; j++) {
				jogoVelha[i][j] = '_';
			}
		}
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
			fim = false;
			vencedor = '1';
			/*for (int i = 0; i < jogoVelha.length; i++) {// com for para coluna e linha
				if (((jogoVelha[0][i] == 'X') || (jogoVelha[0][i] == 'O')) && ((jogoVelha[0][i] == jogoVelha[1][i]) && (jogoVelha[1][i] == jogoVelha[2][i]))){ //Coluna|
					vencedor = jogoVelha[0][i];
					fim = true;
					break;
				}
				if (((jogoVelha[i][0] == 'X') || (jogoVelha[i][0] == 'O')) && ((jogoVelha[i][0] == jogoVelha[i][1]) && (jogoVelha[i][1] == jogoVelha[i][2]))){ //Linha -
					vencedor = jogoVelha[i][0];
					fim = true;
					break;
				}
			}
			if (jogada >= 9)
				fim = true;*/
			
			if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[0][0] == jogoVelha[1][1]) && (jogoVelha[1][1] == jogoVelha[2][2]))){ //Diagonal /
				vencedor = jogoVelha[0][0];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[2][0] == jogoVelha[1][1]) && (jogoVelha[1][1] == jogoVelha[0][2]))){ //diagonal \
				vencedor = jogoVelha[2][0];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[0][0] == jogoVelha[1][0]) && (jogoVelha[1][0] == jogoVelha[2][0]))){ //Coluna 1 |
				vencedor = jogoVelha[0][0];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[0][1] == jogoVelha[1][1]) && (jogoVelha[1][1] == jogoVelha[2][1]))){ //Coluna 2 |
				vencedor = jogoVelha[0][1];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[0][2] == jogoVelha[1][2]) && (jogoVelha[1][2] == jogoVelha[2][2]))){ //Coluna 3 |
				vencedor = jogoVelha[0][2];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[0][0] == jogoVelha[0][1]) && (jogoVelha[0][1] == jogoVelha[0][2]))){ //Linha 1 -
				vencedor = jogoVelha[0][0];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[1][0] == jogoVelha[1][1]) && (jogoVelha[1][1] == jogoVelha[1][2]))){ //Linha 2 -
				vencedor = jogoVelha[0][0];
				fim = true;
			}
			else if (((jogoVelha[0][0] == 'X') || (jogoVelha[0][0] == 'O')) && ((jogoVelha[2][0] == jogoVelha[2][1]) && (jogoVelha[2][1] == jogoVelha[2][2]))){ //Linha 3 -
				vencedor = jogoVelha[0][0];
				fim = true;  
			}
			else {
				fim = false;
				if (jogada >= 9)
					fim = true;
				/*for (int i = 0; i < jogoVelha.length; i++) {
					for (int j = 0; j < jogoVelha.length; j++) {
						if ((jogoVelha[i][j] != 'X') && (jogoVelha[i][j] != 'O')) 
							fim = false;  
					}
				}*/
			}
		}while(!fim); 
		
		if (vencedor == '1')
			System.out.println("Sem Vencedor");
		else
			System.out.println("Vencendor foi: "+vencedor);

	}

}
