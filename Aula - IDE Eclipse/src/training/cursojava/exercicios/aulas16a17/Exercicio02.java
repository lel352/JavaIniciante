package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String login;
		String senha;
		boolean flag = true;
		
		while (flag) {
			System.out.println("Login: ");
			login = scan.nextLine();
			System.out.println("Senha: ");
			senha = scan.nextLine();
			flag = login.equalsIgnoreCase(senha);
			if (flag)
				System.out.println("Login não pode ser igual a senha!");
			
		}
		System.out.println("Saiu!");
	}

}
