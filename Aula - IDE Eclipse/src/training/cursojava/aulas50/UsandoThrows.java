package training.cursojava.aulas50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("Entre com numero decimal: ");
		try {
			double numero = lerNumero();
			System.out.println("Você digitou: "+numero);
		} catch (Exception e) {
			System.out.println("Entrada Invalida !!!");
			e.printStackTrace();
		}
		
	}
	public static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
