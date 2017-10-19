package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean invalido;
		int inicia;
		int termina;
		System.out.print("Tabuada de: ");
		int tabuada = scan.nextInt();
		do {
			invalido = true;
			System.out.print("Inicia em: ");
			inicia = scan.nextInt();
			System.out.print("Termina em: ");
			termina = scan.nextInt();
			if (inicia > termina) {
				System.out.println("Inicial não pode ser maior que final!");
				invalido = false;
			}	
		}while(!invalido);
			
		System.out.println("\n--------------------");
		System.out.println("Vou montar a tabuada de "+tabuada+ " comecando com "+inicia+" terminando com"+termina);
		for (int i = inicia; i <= termina; i++) {
			System.out.println(tabuada+" X "+i+" = "+(i*tabuada));
		}

	}

}
