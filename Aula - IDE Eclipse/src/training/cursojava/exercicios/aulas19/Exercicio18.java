package training.cursojava.exercicios.aulas19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorIdades = new int[10];
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		int posMaior = 0, posMenor = 0;
		
		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.println("idade "+(i+1)+": ");
			vetorIdades[i] = scan.nextInt();
			
			if (vetorIdades[i] > maior) {
				maior = vetorIdades[i];
				posMaior = i;
			}			
			else if (vetorIdades[i] < menor) {
				menor = vetorIdades[i];
				posMenor = i;
			}
		}	
		
		System.out.println("Idade menor: "+menor);
		System.out.println("Posição idade menor: "+posMenor);
		System.out.println("Idade maior: "+maior);
		System.out.println("Posição idade maior: "+posMaior);

	}

}
