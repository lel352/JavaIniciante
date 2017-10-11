package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Nome: ");
		String nome = scan.nextLine(); 
		while (nome.length()<3){
			System.out.println("Nome invalido, menor que 3 caracter !!!");
			System.out.println("Nome: ");
			nome = scan.nextLine();
		}

		System.out.println("idade: ");
		int idade = scan.nextInt();		
		while (idade<0||idade >150) {
			System.out.println("Idade inválida ");
			System.out.println("idade: ");
			idade = scan.nextInt();		
			
		}		
		
		System.out.println("Sexo M F: ");
		String sexo = scan.next(); 
		while (((!sexo.equalsIgnoreCase("f")) && (!sexo.equalsIgnoreCase("m")))){
			System.out.println("Sexo inválido !!");
			System.out.println("Sexo M F: ");
			sexo = scan.next();
		}		
		
		System.out.println("Estado Civil S C V D: ");
		String estadoCivil = scan.next(); 
		while (((!estadoCivil .equalsIgnoreCase("s")) && (!estadoCivil.equalsIgnoreCase("c"))
				&& (!estadoCivil .equalsIgnoreCase("v") && (!estadoCivil .equalsIgnoreCase("d"))))){
			System.out.println("Estado Civil inválido !!");
			System.out.println("Estado Civil S C V D: ");
			estadoCivil  = scan.next();
		}		
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estadoCivil);
	}

}
