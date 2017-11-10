package training.cursojava.exercicios.aulas27;

public class JogoVelhaNovo {
	char[][] jogoVelha = new char[3][3];
	int jogada = 0;
	
	
	public JogoVelhaNovo() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < jogoVelha.length; j++) {
				jogoVelha[i][j] = '_';
			}
		}
	}
	
	public boolean validarJogada(int linha, int coluna, char sinal) {
		if ((jogoVelha[linha-1][coluna-1] == 'X') || (jogoVelha[linha-1][coluna-1] == 'O')){
			return false;
		}			
		else {
			jogoVelha[linha-1][coluna-1] = sinal;
			jogada++;
			return true;
		}
	} 
	
	void imprimirTabuleiro() {
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
	
	public boolean verificaGanhador(char sinal) {
		 if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||     //linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || //diagonal
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)){  //diagonal inversa
            return true;
         } 
		 return false;				
	}
}
