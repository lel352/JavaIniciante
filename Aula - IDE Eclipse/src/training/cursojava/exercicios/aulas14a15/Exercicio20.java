package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Telefonou para v�tima? 1-Sim 2-N�o ");
		int vit = scan.nextInt();
		System.out.println("esteve no local do crime? 1-Sim 2-N�o ");
		int este = scan.nextInt();		
		System.out.println("mora perto da v�tima? 1-Sim 2-N�o ");
		int mora = scan.nextInt();		
		System.out.println("Devia para v�tima? 1-Sim 2-N�o ");
		int devi = scan.nextInt();
		System.out.println("Ja trabalhou com v�tima? 1-Sim 2-N�o ");
		int trab = scan.nextInt();
		int total = 0;
		
		if (vit == 1) 
			total++;
		if (este == 1)
			total++;
		if (mora == 1)
			total++;
		if (devi == 1)
			total++;
		if (trab == 1)
			total++;
		
		switch (total) {
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:			
		case 4:
			System.out.println("C�mplice");
			break;
		case 5:
			System.out.println("Assassino");
			break;						

		default:
			System.out.println("Inocente");
			break;
		}
	}

}
