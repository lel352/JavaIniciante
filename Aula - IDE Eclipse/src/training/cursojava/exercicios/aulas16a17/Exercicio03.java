package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Nome: ");
		String nome = scan.nextLine(); 
		while (nome.length() <= 3){
			System.out.println("Nome invalido, menor que 3 caracter !!!");
			System.out.println("Nome: ");
			nome = scan.nextLine();
		}
		//ou
		boolean infoValida = false;
		/*do {
			System.out.println("Nome: ");
			nome = scan.nextLine();
			if (nome.length() >= 3) {
				infoValida =  true;
			}
			else {
				System.out.println("Nome invalido, menor que 3 caracter !!!");				
			}
		}while(!infoValida);*/

		System.out.println("idade: ");
		int idade = scan.nextInt();		
		while (idade<0||idade >150) {
			System.out.println("Idade inválida ");
			System.out.println("idade: ");
			idade = scan.nextInt();		
			
		}
		/*infoValida = false;
		do {
			System.out.println("Idade: ");
			idade = scan.nextInt();
			if (idade >=0  && idade <=150) {
				infoValida =  true;
			}
			else {
				System.out.println("Idade inválida entre 0 e 150!!");				
			}
		}while(!infoValida);*/
		
		
		System.out.println("Salario: ");
		double salario = scan.nextDouble(); 
		while (salario <= 0){
			System.out.println("Salario inválido !!");
			System.out.println("Salario: ");
			salario = scan.nextDouble();
		}				
		/*infoValida = false;
		do {
			System.out.println("Salario: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValida =  true;
			}
			else {
				System.out.println("Salario inválido !!");				
			}
		}while(!infoValida);*/
		
		
		System.out.println("Sexo M F: ");
		String sexo = scan.next(); 
		while (((!sexo.equalsIgnoreCase("f")) && (!sexo.equalsIgnoreCase("m")))){
			System.out.println("Sexo inválido !!");
			System.out.println("Sexo M F: ");
			sexo = scan.next();
		}		
		
		/*infoValida = false;
		do {
			System.out.println("Sexo M F: ");
			sexo = scan.next();
			if ((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m"))) {
				infoValida =  true;
			}
			else {
				System.out.println("Sexo inválido M e F !!");				
			}
		}while(!infoValida);*/
		
		System.out.println("Estado Civil S C V D: ");
		String estadoCivil = scan.next(); 
		while (((!estadoCivil .equalsIgnoreCase("s")) && (!estadoCivil.equalsIgnoreCase("c"))
				&& (!estadoCivil .equalsIgnoreCase("v") && (!estadoCivil .equalsIgnoreCase("d"))))){
			System.out.println("Estado Civil inválido !!");
			System.out.println("Estado Civil S C V D: ");
			estadoCivil  = scan.next();
		}	
		
		/*infoValida = false;
		do {
			System.out.println("Estado Civil S C V D:  ");
			sexo = scan.next();
			if (((estadoCivil .equalsIgnoreCase("s")) || (estadoCivil.equalsIgnoreCase("c"))
					|| (estadoCivil .equalsIgnoreCase("v") || (estadoCivil .equalsIgnoreCase("d"))))) {
				infoValida =  true;
			}
			else {
				System.out.println("Estado Civil inválido (S C V D)!!");				
			}
		}while(!infoValida);*/
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salario: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estadoCivil);
	}

}
