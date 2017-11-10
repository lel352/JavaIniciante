package training.cursojava.exercicios.aulas27;

import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ContaCorrente cc = new ContaCorrente();
		
		cc.cliente = "A";
		cc.depositarDinheiro(10);
		cc.consultarSaldo();
		cc.limite = 100000;
		cc.especial = true;
		cc.consultarSaldo();
		cc.realizarSaque(15);
		cc.consultarSaldo();
		cc.realizarSaque(5);*/
		
		/*Jogovelha jv = new Jogovelha();
		jv.iniciar();*/
		Scanner scan = new Scanner(System.in);
		
		/*Aluno aluno = new Aluno();
		System.out.println("Nome do Aluno: ");
		aluno.nome = scan.next();
		System.out.println("Nome do Curso: ");
		aluno.curso = scan.next();
		System.out.println("Matricula: ");
		aluno.matricula = scan.next();
		//aluno.diciplinas = new String[3];
		for (int i = 0; i < aluno.diciplinas.length; i++) {
			System.out.println((i+1)+"ª Diciplina: ");
			aluno.diciplinas[i] = scan.next(); 
		}
		
		for (int i = 0; i < aluno.diciplinasNotas.length; i++) {
			System.out.println("Notas da Diciplina: "+aluno.diciplinas[i]);
			for (int j = 0; j < aluno.diciplinasNotas[i].length; j++) {
				System.out.println("Entre com a nota "+(j+1));
				aluno.diciplinasNotas[i][j] = scan.nextDouble();				
			}
		} 
		
		aluno.mostrarInfo();
		
		for (int i = 0; i < aluno.diciplinas.length; i++) {
			
			if (aluno.verificarAprovado(i)) 
				System.out.println("Disciplina "+aluno.diciplinas[i]+" aprovado!!!");
			else
				System.out.println("Disciplina "+aluno.diciplinas[i]+" Reprovado!!!");
			
		}*/
		
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
		    if (jogoVelha.jogada >= 9) {
		    	System.out.println("Jogo impatou!! ");
		    	fim = true;
		    }
			vez = !vez;
		}while(!fim);
	}
}
