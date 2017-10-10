package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("A-Alcool G-Gasolina: ");
		String res = scan.next();		
		System.out.println("Litro: ");
		double litro = scan.nextDouble();
		double total;
		double totalDesconto =0;		
		
		if (res.toUpperCase().equals("A")) {
			total = litro*1.90;
			if (litro > 20) {
				totalDesconto = (total*5)/100;
			}
			else {
				totalDesconto = (total*3)/100;
			}			
		}
		else if (res.toUpperCase().equals("G")) {
			total = litro*2.50;
			if (litro > 20) {
				totalDesconto = (total*6)/100;
			}
			else {
				totalDesconto = (total*4)/100;
			}
		} 
		else {
			System.out.println("Opção errada");
			return;
		}
		
		System.out.println("Total: "+total);
		System.out.println("Total de desconto: "+totalDesconto);
		total = total - totalDesconto;
		System.out.println("Valora a pagar: "+total);
	}

}
