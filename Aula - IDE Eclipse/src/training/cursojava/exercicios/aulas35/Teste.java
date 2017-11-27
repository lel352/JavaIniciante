package training.cursojava.exercicios.aulas35;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("N-ésimo: ");
		int numero = scan.nextInt();
		
		
		int resultado = ExerciciosRecursivos.somatorio(numero);
		System.out.println("Resultado de "+numero+": "+resultado);
		
		resultado = ExerciciosRecursivos.fibonaci(numero);
		System.out.println("Resultado de "+numero+": "+resultado);

	}

}
