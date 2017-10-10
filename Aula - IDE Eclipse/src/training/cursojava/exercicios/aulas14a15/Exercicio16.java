package training.cursojava.exercicios.aulas14a15;

import java.util.Scanner;

import javax.xml.soap.Detail;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.println("a: ");
		double a = scan.nextDouble();
		if (a == 0) {
			System.out.println("Não é equação de segundo Grau");
			return;
		}
		System.out.println("b: ");
		double b = scan.nextDouble();
		System.out.println("c: ");
		double c = scan.nextDouble();
		
		double delta = (Math.pow(b, 2)) - (4*a*c);
		if (delta < 0) {
			System.out.println("Delta negativo: "+delta+"\n Equação não possui raizes reais");
			return;
		}
		else if (delta > 0 ) {
			double x1 = (-b- Math.sqrt(delta))/(2*a);
			double x2 = (-b +Math.sqrt(delta))/(2*a);
			System.out.println("a: "+a);
			System.out.println("b: "+b);
			System.out.println("c: "+c);
			System.out.println("Detal: "+delta);
			System.out.println("x\':"+x1);
			System.out.println("x\":"+x2);
		}
		else{
			double resu = -b/(2*a);
			System.out.println("a: "+a);
			System.out.println("b: "+b);
			System.out.println("c: "+c);
			System.out.println("Detal: "+delta);
			System.out.println("x:"+resu);
		}
	}

}
