package training.cursojava.exercicios.aulas11a13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor/Horas: ");
		double valor = scan.nextDouble();
		System.out.println("Horas/Mes: ");
		double horas = scan.nextDouble();
		
		double salario = valor*horas;
		
		double impostoRenda = (salario*11)/100;
		double inss = (salario*8)/100;
		double sindicato = (salario*5)/100;
		double descontos =impostoRenda + inss + sindicato; 
		
		double liquido = salario-descontos;
		
		System.out.println("Salário Bruto: "+salario);
		System.out.println("Pagou INSS: "+inss);
		System.out.println("Pagou Sindicato: "+sindicato);
		System.out.println("Pagou Imposto Renda: "+impostoRenda);
		System.out.println("Salário liquido: "+liquido);
		System.out.println("Descontos: "+descontos);
	}

}
