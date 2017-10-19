package training.cursojava.exercicios.aulas16a17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Salario: ");
		double salario = scan.nextDouble();
		double porcetagem = 1.5;
		double aumento = 0;
		
		DecimalFormat format =  new DecimalFormat("#,##0.00");
		for (int i = 1996; i < 2018; i++) {
			aumento = (salario*porcetagem)/100;
			salario += aumento;
			porcetagem += porcetagem;
			System.out.println("Ano = "+i+" Salario final: R$ "+format.format(salario)+" percentual = "+porcetagem);
		}
		System.out.println("Salario final: R$"+salario);
	}

}
