package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor Produto1: ");
		int valor1 = scan.nextInt();
		System.out.println("Valor Produto2: ");
		int valor2 = scan.nextInt();
		System.out.println("Valor Produto3: ");
		int valor3 = scan.nextInt();
		
	
		if ((valor1 > valor2) && (valor1 > valor3)){
			System.out.println(valor1);
			if (valor2 > valor3) {
				System.out.println(valor2);
				System.out.println(valor3);
			}				
			else {
				System.out.println(valor3);
				System.out.println(valor2);				
			}	
		}else if ((valor2 > valor1) && (valor2 > valor3)){
			System.out.println(valor2);
			if (valor1 > valor3) {
				System.out.println(valor1);
				System.out.println(valor3);
			}				
			else {
				System.out.println(valor3);
				System.out.println(valor1);				
			}
			    
		}else{
			System.out.println(valor3);
			if (valor2 > valor1) {
				System.out.println(valor2);
				System.out.println(valor1);				
			}
				
			else {
				System.out.println(valor1);
				System.out.println(valor2);
			}	
		}
		
		if ((valor1 >= valor2) && (valor2 >= valor3) && (valor1 >= valor3)){
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);
			
		}
		else if ((valor1 >= valor2) && (valor3 >= valor2) && (valor1 >= valor3)) {
			System.out.println(valor1);
			System.out.println(valor3);
			System.out.println(valor2);
		}		
		else if ((valor2 >= valor1) && (valor1 >= valor3) && (valor2 >= valor3)) {
			System.out.println(valor2);
			System.out.println(valor1);
			System.out.println(valor3);
		}else if ((valor2 >= valor1) && (valor3 >= valor1) && (valor2 >= valor3)) {
			System.out.println(valor2);
			System.out.println(valor3);
			System.out.println(valor1);
		}else if ((valor3 >= valor1) && (valor1 >= valor2) && (valor3 >= valor2)) {
			System.out.println(valor3);
			System.out.println(valor1);
			System.out.println(valor2);
		}
		else if ((valor3 >= valor1) && (valor2 >= valor1) && (valor3 >= valor2)) {
			System.out.println(valor3);
			System.out.println(valor2);
			System.out.println(valor1);
		}
			
		
		
	}
}
