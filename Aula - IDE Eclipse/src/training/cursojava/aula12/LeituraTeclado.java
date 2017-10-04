package training.cursojava.aula12;

import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Seu nome: "+nome);
		String primeiroNome;
		
		/*System.out.println("Primeiro nome: ");
		String primeiroNome = scan.next();
		
		System.out.println("Seu Primeiro nome: "+primeiroNome);*/	
		
		System.out.print("idade: ");
		int idade = scan.nextInt();
		System.out.println("idede: "+idade);
		
		scan.next();
		System.out.println("Digite nome idade altura: ");
		primeiroNome = scan.next();
		idade = scan.nextInt();
		float altura = scan.nextFloat();
		
		System.out.print("Você digitou: "+primeiroNome+" "+idade+" "+altura);
	}

}
