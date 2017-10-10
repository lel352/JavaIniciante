package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Carne 1-File Duplo 2-Alcatra 3-Picanha ");
		int opcao = scan.nextInt();
		System.out.println("kg Carne: ");
		double kgCarne = scan.nextDouble();
		System.out.println("Tipo Pagamento 1-dinhero 2-Cartão tabajara 3-Outro ");
		int opcao2 = scan.nextInt();
		double valor = 0;
		double desconto = 0;
		
		switch (opcao) {
		case 1:
			if (kgCarne > 5) {
				valor = kgCarne*5.8;   
			}
			else {
				valor = kgCarne*4.9;
			}			
			break;
		case 2:
			if (kgCarne > 5) {
				valor = kgCarne*6.8;   
			}
			else {
				valor = kgCarne*5.9;
			}
			break;
		case 3:	
			if (kgCarne > 5) {
				valor = kgCarne*7.8;   
			}
			else {
				valor = kgCarne*6.9;
			}
			break;
		default:
			System.out.println("Opção invalida");
			return;		
		}
				
		if (opcao2 == 2) {
			desconto = (valor*5)/100; 
		}
		
		System.out.println("-------Nota-------");
		switch (opcao) {
		case 1:
			System.out.println("File Duplo");
			break;
		case 2:
			System.out.println("Alcatra");
			break;
		case 3:
			System.out.println("Picanha");
			break;			
		} 
		System.out.println("Total Kg: "+kgCarne);
		System.out.println("Preço Total: "+valor);
		switch (opcao2) {
		case 1:
			System.out.println("Forma de pagamento: Dinheiro");
			break;
		case 2:
			System.out.println("Forma de pagamento:Cartão Tabajara");
			break;
		case 3:
			System.out.println("Forma de pagamento:Outro");
			break;			
		} 		
		System.out.println("desconto: "+desconto);
		valor = valor - desconto;
		System.out.println("Valor a Pagar: "+valor);
	}

}
