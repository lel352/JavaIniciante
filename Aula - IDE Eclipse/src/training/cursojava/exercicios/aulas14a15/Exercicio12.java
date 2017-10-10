package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Valor/hora: ");
		double valor = scan.nextDouble();		
		System.out.println("Horas/Mes: ");
		int hora = scan.nextInt();
		
		double salarioBruto = valor*hora;
		double fgts = (salarioBruto*11)/100;
		//double sindicato = (salarioBruto*3)/100;  
		double inss = (salarioBruto*10)/100;
		double salarioLiquido;
		int irPercentual = 0;
		double ir = 0;
		if ((salarioBruto > 900) && (salarioBruto <= 1500)) {
			irPercentual = 5;			
			ir = (salarioBruto*irPercentual)/100;
		}
		else if ((salarioBruto > 1500) && (salarioBruto <= 2500)) {
			irPercentual = 10;
			ir = (salarioBruto*irPercentual)/100;			
		}
		else if (salarioBruto > 2500){
			irPercentual = 20;
			ir = (salarioBruto*irPercentual)/100;			
		}		
		double desconto = inss+ir;
		salarioLiquido = salarioBruto - desconto;
		
		System.out.println("Salario Bruto("+hora+" * "+valor+"): "+salarioBruto);
		System.out.println("(-) IR("+irPercentual+"%): "+ir);		
		System.out.println("(-) INSS(10%): "+inss);		
		System.out.println("FGTS(11%): "+fgts);		
		System.out.println("Total desconto: "+desconto);		
		System.out.println("Salario Liquido: "+salarioLiquido);				
	}

}
