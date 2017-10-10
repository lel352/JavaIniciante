package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Numero 1: ");
		int valor1 = scan.nextInt();
		System.out.println("Numero 2: ");
		int valor2 = scan.nextInt();

		System.out.println("Escolha Opera��o: 1-Adi��o 2-subtra�ao 3-Multiplica��o 4-Divis�o");
		int operacao = scan.nextInt();

		double resu;
		switch(operacao){
			case 1: 
				resu = valor1+valor2;
				System.out.println(valor1+" + "+valor2+" = "+resu);
				break;
			case 2: 
				resu = valor1-valor2;
				System.out.println(valor1+" - "+valor2+" = "+resu);
				break;
			case 3: 
				resu = valor1*valor2;
				System.out.println(valor1+" * "+valor2+" = "+resu);
				break;
			case 4: 
				resu = valor1/valor2;
				System.out.println(valor1+" / "+valor2+" = "+resu);
				break;	
			default:	
				System.out.println("Op��o invalida");
				return;
		}
		if ((resu % 2) == 0)
			System.out.println(resu+" � Par");
		else
			System.out.println(resu+" � Impar");

		if (resu >= 0)
			System.out.println(resu+" � Positivo");
		else
			System.out.println(resu+" � Negativo");
	}

}
