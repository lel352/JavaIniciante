package training.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Semana: ");
		int dia = scan.nextInt();
		
		switch (dia) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda");
			break;
		case 3: 
			System.out.println("Terça");
			break;
		case 4: 
			System.out.println("Quarta");
			break;
		case 5: 
			System.out.println("Quinta");
			break;
		case 6: 
			System.out.println("Sexta");
			break;			
		case 7: 
			System.out.println("Sabado");
			break;			
		default:
			System.out.println("Não é um dia valido");
			break;
		}
		
		
		switch (dia) {
		case 2:
		case 3:
		case 4:
		case 6: 
			System.out.println("Dia útil");
			break;
		case 1:
		case 7:
			System.out.println("Fim de Semana");
			break;			
		default:
			System.out.println("Não é um dia valido");
			break;
		}
	}

}
