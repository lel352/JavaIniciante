package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("lado1: ");
		double lado1 = scan.nextDouble();
		System.out.println("lado2: ");
		double lado2 = scan.nextDouble();
		System.out.println("lado3: ");
		double lado3 = scan.nextDouble();
		
		if (((lado1+lado2) >lado3) || ((lado2+lado3) >lado1) || ((lado1+lado3) >lado2)) {
			if ((lado1 == lado2) && (lado1 == lado3)) {
				System.out.println("Equilátero: Três lados iguais");	
			}
			else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
				System.out.println("Escaleno: Três lados diferentes");
			}
			else {
				System.out.println("Isósceles: Dois lados iguais");
			}
		}else
			System.out.println("Triangulo inválido");
			
	}	
}
