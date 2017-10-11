package training.cursojava.exercicios.aulas16a17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		byte par=0;
		byte impar=0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Numero "+(i+1)+": ");
			numero = scan.nextInt();
			if ((numero % 2) == 0)
				par++;
			else
				impar++;			
		}
		System.out.println("Quantidade par: "+par);
		System.out.println("Quantidade impar: "+impar);

	}

}
