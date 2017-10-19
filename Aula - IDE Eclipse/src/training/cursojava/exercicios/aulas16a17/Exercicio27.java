package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String resposta = "S";
		double soma = 0;
		double maior = 0;
		double menor = 0;
		double temperatura;
		int contador = 0; 
		
		while (resposta.equalsIgnoreCase("S")) {
			System.out.println("Temperatura ");
			temperatura = scan.nextDouble();
			if (contador == 0) {
				maior = menor = temperatura;				
			}
			else {
				maior = (temperatura > maior)?temperatura:maior;
				menor = (temperatura < menor)?temperatura:menor;				
			}			
			contador++;
			soma += temperatura;
			System.out.println("Nova temperatura? S-Sim N-Não");
			resposta = scan.next();			
		}
		double media = soma/contador;
		System.out.println(contador+" temperaturas informada ");
		System.out.println("Sua Media é: "+media);
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);

	}

}
